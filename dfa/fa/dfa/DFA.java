package fa.dfa;

import java.util.ArrayList;
import java.util.Set;

import fa.State;

public class DFA implements DFAInterface {
	private DFAState startState;
	private ArrayList<DFAState> finalStates;
	private ArrayList<DFAState> states; // non initial, non final states
	private ArrayList<Character> alphabet;
	
	@Override
	public void addStartState(String name) {
		this.startState = new DFAState(name);		
	}

	@Override
	public void addState(String name) {
		DFAState x = new DFAState(name);
		states.add(x);

	}

	@Override
	public void addFinalState(String name) {
		DFAState x = new DFAState(name);
		finalStates.add(x);

	}
	private DFAState findState(String state)
	{
		int i;
			for(i=0; i<states.size(); i++){
				if(state.toString().equals(states.get(i).toString()))
				{
					return states.get(i);
				}
			}
			for(i=0;i<finalStates.size(); i++){
				if(state.toString().equals(finalStates.get(i).toString()))
				{
					return finalStates.get(i);
				}
			}
			if(state.toString().equals(startState.toString()))
			{
				return startState;
			}
		return null;
		
	}
	@Override
	public void addTransition(String fromState, char onSymb, String toState) 
	{
		alphabet.add(onSymb);
		findState(fromState).addTransition(onSymb, findState(toState));
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
		return startState;
	}

	@Override
	public Set<Character> getABC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean accepts(String s) { //Important Method
		DFAState currentState = startState;
		for(int i = 0;i< s.length(); i++)
		{
			if(currentState == null)
				return false;
			if(!alphabet.contains(s.charAt(i)))
				return false;
			currentState = currentState.doTransition(s.charAt(i));
		}
		if(finalStates.contains(currentState))
			return true;
		
		return false;
	}

	@Override
	public State getToState(DFAState from, char onSymb) {
		if(alphabet.contains(onSymb))
			return from.doTransition(onSymb);
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
