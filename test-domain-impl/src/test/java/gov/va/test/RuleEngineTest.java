package gov.va.test;

import gov.va.domain.impl.Vet;
import gov.va.domain.impl.VetAddress;

import org.junit.Assert;
import org.junit.Test;
import org.yare.api.Node;
import org.yare.api.Rule;
import org.yare.api.RuleNode;
import org.yare.conditionals.impl.EqualsConditionImpl;
import org.yare.conditionals.impl.GreaterThanConditionImpl;
import org.yare.impl.RuleImpl;
import org.yare.impl.RuleNodeImpl;
import org.yare.logic.nodes.impl.AndNodeImpl;
import org.yare.logic.nodes.impl.NotNodeImpl;

public class RuleEngineTest {

	
	@Test
	public void testRuleNodeOrNodes(){

		
		//Build the domain object
		Vet aVet = new Vet();
		aVet.setAge(10);
		aVet.setFirstName("Brad");

		//Build one rule node

		RuleNode<Vet,String> ruleNode1 = new RuleNodeImpl<Vet,String>();
		ruleNode1.setObservableClass(Vet.class);
		ruleNode1.setValue("Brad");
		ruleNode1.setFieldName("firstName");
		ruleNode1.setConditional(new EqualsConditionImpl());
		
		RuleNodeImpl<Vet,Integer> ruleNode2 = new RuleNodeImpl<Vet,Integer>();
		ruleNode2.setObservableClass(Vet.class);
		ruleNode2.setValue(15);
		ruleNode2.setFieldName("age");
		ruleNode2.setConditional(new GreaterThanConditionImpl());
		
		
		Node<Vet,String> andNode1 = new AndNodeImpl<Vet,String>();
		andNode1.getNodes().add(ruleNode1);
		
		Node<Vet,Integer> andNode2 = new AndNodeImpl<Vet,Integer>();
		andNode2.getNodes().add(ruleNode2);
		
		Rule rule = new RuleImpl();
		rule.getNodes().add(andNode1);
		rule.getNodes().add(andNode2);
	
		Assert.assertTrue(rule.execute(aVet));
	}
	
	
	@Test
	public void testNegitiveAndTestCase(){

		
		//Build the domain object
		Vet aVet = new Vet();
		aVet.setAge(10);
		aVet.setFirstName("Brads");
		
		VetAddress address = new VetAddress();
		address.setAddressLine1("3109 Surber");
		aVet.getAddresses().add(address);

		//Build one rule node

		RuleNodeImpl<Vet,String> ruleNode1 = new RuleNodeImpl<Vet,String>();
		ruleNode1.setObservableClass(Vet.class);
		ruleNode1.setValue("Brad");
		ruleNode1.setFieldName("firstName");
		ruleNode1.setConditional(new EqualsConditionImpl());
		
		RuleNodeImpl<Vet,Integer> ruleNode2 = new RuleNodeImpl<Vet,Integer>();
		ruleNode2.setObservableClass(Vet.class);
		ruleNode2.setValue(15);
		ruleNode2.setFieldName("age");
		ruleNode2.setConditional(new GreaterThanConditionImpl());
		
		
		Node<Vet,String> andNode1 = new AndNodeImpl<Vet,String>();
		andNode1.getNodes().add(ruleNode1);
		
		Node<Vet,Integer> andNode2 = new AndNodeImpl<Vet,Integer>();
		andNode2.getNodes().add(ruleNode2);
		
		Rule rule = new RuleImpl();
		rule.getNodes().add(andNode1);
		rule.getNodes().add(andNode2);
	
		Assert.assertFalse(rule.execute(aVet));
	}
	
	

	@Test
	public void testNotNodeTestCase(){

		
		//Build the domain object
		Vet aVet = new Vet();
		aVet.setAge(10);
		aVet.setFirstName("Brads");

		//Build one rule node

		RuleNodeImpl<Vet,String> ruleNode = new RuleNodeImpl<Vet,String>();
		ruleNode.setObservableClass(Vet.class);
		ruleNode.setValue("Brads");
		ruleNode.setFieldName("firstName");
		ruleNode.setConditional(new EqualsConditionImpl());
		
		RuleNodeImpl<Vet,Integer> ruleNode2 = new RuleNodeImpl<Vet,Integer>();
		ruleNode2.setObservableClass(Vet.class);
		ruleNode2.setValue(15);
		ruleNode2.setFieldName("age");
		ruleNode2.setConditional(new EqualsConditionImpl());
		
		
		Node<Vet,String> andNode1 = new AndNodeImpl<Vet,String>();
		andNode1.getNodes().add(ruleNode);
		
		Node<Vet,Integer> notNode1 = new NotNodeImpl<Vet,Integer>();
		notNode1.getNodes().add(ruleNode2);
	
		
		Rule rule = new RuleImpl();
		rule.getNodes().add(andNode1);
		rule.getNodes().add(notNode1);
	
		Assert.assertTrue(rule.execute(aVet));
	}
	
	@Test
	public void testNotNegitiveNodeTestCase(){

		
		//Build the domain object
		Vet aVet = new Vet();
		aVet.setAge(10);
		aVet.setFirstName("Brads");

		//Build one rule node

		RuleNodeImpl<Vet,String> ruleNode = new RuleNodeImpl<Vet,String>();
		ruleNode.setObservableClass(Vet.class);
		ruleNode.setValue("Brads");
		ruleNode.setFieldName("firstName");
		ruleNode.setConditional(new EqualsConditionImpl());
		
		RuleNodeImpl<Vet,Integer> ruleNode2 = new RuleNodeImpl<Vet,Integer>();
		ruleNode2.setObservableClass(Vet.class);
		ruleNode2.setValue(10);
		ruleNode2.setFieldName("age");
		ruleNode2.setConditional(new EqualsConditionImpl());
		
		
		Node<Vet,String> andNode1 = new AndNodeImpl<Vet,String>();
		andNode1.getNodes().add(ruleNode);
		
		Node<Vet,Integer> notNode1 = new NotNodeImpl<Vet,Integer>();
		notNode1.getNodes().add(ruleNode2);
	
		
		Rule rule = new RuleImpl();
		rule.getNodes().add(andNode1);
		rule.getNodes().add(notNode1);
	
		Assert.assertFalse(rule.execute(aVet));
	}
	
	
}
