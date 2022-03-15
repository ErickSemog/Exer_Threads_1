package view;
import controller.Threads;
public class Principal {
//exer #1 --- erick semog --- 
	public static void main(String[] args) {
		for(int idThread = 0; idThread < 5; idThread++) {
			//impressão.
			Thread Threads = new Threads(idThread);
			Threads.start();
	}

	}

}
