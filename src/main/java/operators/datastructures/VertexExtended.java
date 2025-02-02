package operators.datastructures;

// import org.apache.flink.api.java.tuple.Triplet;

/**
 * Extended vertex for Cypher Implementation
 * @param <K> the key type for the vertex ID
 * @param <L> the vertex label type
 * @param <P> the vertex properties type
 */
public class VertexExtended<K, L, P> implements java.io.Serializable{
	
	// private static final long serialVersionUID = 1L;
	private K f0;
	private String f1;
	private P f2;

	public VertexExtended(){};
	
	public VertexExtended(K vertexId, String label, P props) {
		this.f0 = vertexId;
		this.f1 = label;
		this.f2 = props;
	}
	
	public void setVertexId(K vertexId) {
		this.f0 = vertexId;
	}

	public K getVertexId() {
		return this.f0;
	}

	public void setLabel(String label) {
		this.f1 = label;
	}

	public String getLabel() {
		return f1;
	}
	
	public void setProps(P props) {
		this.f2 = props;
	}

	public P getProps() {
		return f2;
	}
	
		
	/*Check whether the input label matches the label of a indicated vertex*/
/*	public boolean containsLabel(E labelInput) {
		if(labelInput.equals(f2))
			return true;
		else return false;
	}*/
	
	/*Check whether the input props matches the label of a indicated vertex*/
/*	public boolean containsProps(V propsInput) {
		//if(propsInput.)	
		return true;
	}*/
}
