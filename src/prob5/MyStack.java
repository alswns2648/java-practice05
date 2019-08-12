package prob5;

//stack 만드록 pop동작
public class MyStack {

	private int top = -1; 
	private String[] buffer; 

	public MyStack(int i) {
		buffer = new String[i];		
	}

	public void push(String s){
		if(top+1 < buffer.length) {
			buffer[++top] = s;
		}else {
			String[] mybuffer = new String[buffer.length*2];
			for(int i = 0; i < buffer.length; i++) {
				mybuffer[i]=buffer[i];
			}
			mybuffer[++top]=s; // top : 값이 입력되는 장소 
			// top : 배열 몇개가 차있는지 
			buffer = mybuffer; 
		}
	}

	public String pop() throws MyStackException{
		if(isEmpty()) {
			throw new MyStackException("stack is empty");
		}else {
			return buffer[top--];
		}
	}

	public boolean isEmpty() {
		if(top == -1){
			return true;
		}else {
			return false;
		}
	}
}
