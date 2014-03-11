package csep.ui.autoedit;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextUtilities;

import csep.parser.Helper;

public class IndentLineAutoEditStrategy extends
		DefaultIndentLineAutoEditStrategy {

	private static final String EDITORS_QUALIFIER = "org.eclipse.ui.editors";

	/**
	 * Start an indented block after certain lines
	 */
	public void customizeDocumentCommand(IDocument d, DocumentCommand c) {
		super.customizeDocumentCommand(d, c);
		// c.text now may be "\n\t\t", because tabs were appended
		if (c.length == 0 && c.text != null && TextUtilities.startsWith(d.getLegalLineDelimiters(), c.text) != -1)
			indentBlock(d, c);
	}	
	
	protected void indentBlock(IDocument d, DocumentCommand c) {
		if (c.offset == -1 || d.getLength() == 0)
			return;

		try {
			// find start of line
			int p = (c.offset == d.getLength() ? c.offset  - 1 : c.offset);
			IRegion info= d.getLineInformationOfOffset(p);
			String line = d.get(info.getOffset(), info.getLength());
			if (Helper.isBlockContainer(line)) {
				if (Helper.isBlockContainer(line)) {
					boolean spacesForTabs = Platform.getPreferencesService().getBoolean(EDITORS_QUALIFIER,
					        "spacesForTabs", false, null);
					if (spacesForTabs) {
						int tabWidth = Platform.getPreferencesService().getInt(EDITORS_QUALIFIER, "tabWidth", 4, null);
						for (int i = 0; i < tabWidth; i++) {
							c.text += " ";
						}
					} else {
						c.text += "\t";
					}
				}
			}
		}
		catch (BadLocationException e) {
			// do nothing
		}
	}
	
}
