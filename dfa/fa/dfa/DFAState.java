import fa.State;

/**
 *  An extension of State.java. Will include additional information,
 *  like the state's transition functions leading out of the state.
 * @author Cody Palin, Dominick Edmonds
 */
public class DFAState extends State {
private int a = 0;//next element in array
private String[] transitions;
private DFAState[] states;
	/**
	 * Constructor for a DFAState, specifically to get the name
	 * @param name
	 */
	public DFAState(String name){
		this.name = name;
		transitions = new String[8];
		states = new DFAState[8];
	}
	
	public void addTransition(String transition, DFAState state) {
		/*
		if(a+1 > transitions.length) {
		}//change size of array when too large
		*/
		transitions[a]= transition;
		states[a]= state;
		a++;
	}
	
	/**
	 * @param transition to use
	 * @return returns null if transition string not found, otherwise
	 * returns the DFA state achieved by getting to that transition
	 */
	public DFAState doTransition(String transition) {
		for(int i = 0;i<a;i++) {
			if(transition.equals(transitions[i])) {
				return states[i];
			}
		}
		return null;
		
	}
}
