package csep.tests

import org.junit.Test

class ClassTest extends ParserTestBase {
	
	@Test
	def void testBasic() {
		ok('''
		  class NicePerson extends Person
		    firstName: "John"
		    lastName: "Doe"
		    
		    introduce: -> print "I am #{firstName} #{lastName}"
		    
		    greet: (other) ->
		      print "Hello #{other}"
		''')
	}
	
	@Test
	def void testMethods() {
		ok('''
		  class A
		    constructor: (@name) ->
		''')
		ok('''
		  class Drinker extends Person
		    drink: ->
		      #print "gulp"
		      @glasses += 1
		      super 2
		''')
	}
	
	@Test
	def void testAssign() {
		shouldBeOk('''
		  exports.Scope = class Scope
		    @root: null
		''')
	}
	
	@Test
	def void testConstructor() {
		ok('''
		  class Scope
		  
		    # Comment
		    constructor: (@param) ->
		      @bar = 0
		''')
	}
}