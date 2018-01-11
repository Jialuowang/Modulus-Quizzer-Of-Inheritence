import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class runner
	{

		public static void main(String[] args) throws IOException
			{
				
				questionAsking();
				
			}

		private static void questionAsking() throws IOException
			{
				int correct = 0;
				Scanner question = new Scanner(System.in);
				System.out.println("How many question you want?(at least 3 question)");
				int numberOfQuestion = question.nextInt();
				
				
				for(int n = 0; n < numberOfQuestion; n++)
					{
						int randomNumber3 = (int)(Math.random() * 3) + 1;
						int randomNumber4 = (int)(Math.random() * 4) + 1;
						System.out.println("this is the code : ");
						coding();
						System.out.println();
						System.out.println();
						System.out.println("if the code runs:");
						switch(randomNumber3)
						{
							case 1:
									{
										
									}
							case 2:
									{
										
									}
							case 3:
									{
										
									}
						}
						switch(randomNumber4)
						{
							case 1:
									{
										
									}
							case 2:
									{
										
									}
							case 3:
									{
										
									}
							case 4:
									{
										
									}
						}
						System.out.println("what will the result be?");
						System.out.println();
						String ua = question.nextLine();
						String userAnswer = ua.toUpperCase();
						
					}
				
			}

		private static void coding() throws IOException
			{
				Scanner file = new Scanner(new File("codelist.txt"));
				while(file.hasNextLine())
					{
						System.out.println(file.nextLine());
					}
				
			}

	}
