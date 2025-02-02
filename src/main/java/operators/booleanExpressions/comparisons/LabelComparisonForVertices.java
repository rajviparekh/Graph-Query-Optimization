package operators.booleanExpressions.comparisons;

import java.util.HashMap;
import java.util.HashSet;

import operators.datastructures.VertexExtended;
import operators.helper.FilterFunction;

// @SuppressWarnings("serial")
public class LabelComparisonForVertices
		implements FilterFunction<VertexExtended<Long, HashSet<String>, HashMap<String, String>>> {

	private String label;

	public LabelComparisonForVertices(String label) {
		this.label = label;
	}

	@Override
	public boolean filter(
			VertexExtended<Long, HashSet<String>, HashMap<String, String>> vertex){
		if (vertex.getLabel().equals(label) || label.equals(""))
			return true;
		else
			return false;
	}

}
