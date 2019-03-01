package fa.dfa;
import fa.State;

/**
 *  An extension of State.java. Will include additional information,
 *  like the state's transition functions leading out of the state.
 * @author Cody Palin, Dominick Edmonds
 */
public class DFAState extends State {
private int a;//next element in array
private char[] transitions;
private DFAState[] states;
	/**
	 * Constructor for a DFAState, specifically to get the name
	 * @param name
	 */
	public DFAState(String name){
		this.name = name;
		a=0;
		transitions = new char[16];
		states = new DFAState[16];
	}
	
	/**
	 * @param transition transition character to add to machine
	 * @param state state to add that corresponds with the transition provided
	 */
	public void addTransition(char onSymb, DFAState state) {
		/*
		if(a+1 > transitions.length) {
		}//change size of array when too large
		*/
		transitions[a]= onSymb;
		states[a]= state;
		a++;
	}
	
	/**
	 * @param transition to use
	 * @return returns null if transition string not found, otherwise
	 * returns the DFA state achieved by getting to that transition
	 */
	public DFAState doTransition(char transition) {
		for(int i = 0;i<a;i++) {
			if(transition == transitions[i]) {
				return states[i];
			}
		}
		return null;
		
	}
}
