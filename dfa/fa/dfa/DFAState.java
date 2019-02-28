package fa.dfa;
import fa.State;

/**
 *  An extension of State.java. Will include additional information,
 *  like the state's transition functions leading out of the state.
 * @author Cody Palin, Dominick Edmonds
 */
public class DFAState extends State {

	/**
	 * Constructor for a DFAState, specifically to get the name
	 * @param name
	 */
	public DFAState(String name){
		this.name = name;
	}
}
