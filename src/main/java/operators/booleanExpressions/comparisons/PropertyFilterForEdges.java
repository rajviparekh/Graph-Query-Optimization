package operators.booleanExpressions.comparisons;

import java.util.HashMap;

import operators.datastructures.EdgeExtended;
import operators.helper.FilterFunction;

public class PropertyFilterForEdges implements FilterFunction<EdgeExtended>{


	private String propertyKey;
	private String op;
	private String propertyValue;
	private double propertyValueDouble;
	
	public PropertyFilterForEdges(String propertyKey, String op, String propertyValue) {
		this.propertyKey = propertyKey;
		this.op = op;
		try {
			this.propertyValueDouble = Double.parseDouble(propertyValue);
		} 
		catch (Exception e) {}
	}
	
	@Override
	public boolean filter(
			EdgeExtended edge)
			throws Exception {
		if(edge.getProps().get(this.propertyKey) == null) {
			return false;
		}
		double ep = 0;
		try {
			ep = Double.parseDouble(edge.getProps().get(this.propertyKey));
		}
		catch(Exception e) {}
		switch(op) {
			case ">": {
				return ep > propertyValueDouble;	
			}
			case "<": {
				return ep < propertyValueDouble;	
			}
			case "=": {
				return ep == propertyValueDouble; 
			}
			case ">=": {
				return ep >= propertyValueDouble; 
			}
			case "<=": {
				return ep <= propertyValueDouble; 
			}
			case "<>": {
				return ep != propertyValueDouble; 
			}
			case "eq": {
				return edge.getProps().get(this.propertyKey).equals(propertyValue);
			}
			default: return false;
			}
		}
}
