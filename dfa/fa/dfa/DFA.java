package fa.dfa;

import java.util.Set;

import fa.State;

public class DFA implements DFAInterface {
	private DFAState startState;
	private DFAState[] finalStates;
	
	@Override
	public void addStartState(String name) {
		this.startState = new DFAState(name);		
	}

	@Override
	public void addState(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFinalState(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTransition(String fromState, char onSymb, String toState) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<? extends State> getStates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<? extends State> getFinalStates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State getStartState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Character> getABC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean accepts(String s) { //TODO: Important Method
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public State getToState(DFAState from, char onSymb) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString(){
		String retVal = new String();
		
		//Q = {} //set of all states
		//Sigma = {} //Alphabet
		//Delta = //Transition functions
		//q0 = //startState
		//f = {} //final states
		
		return retVal;
	}

}
