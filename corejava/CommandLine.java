package corejava;
public class CommandLine {
public static void main(String[] args) {
	//System.out.println("name "+args[0]);
	for(int i=0;i<args.length;i++)
	{
		System.out.println("args["+i+"]: "+ args[i]);
	}
}
}
