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
					System.out.print("creating question");
					for(int p = 0 ; p < 5 ; p++)
						{
							try
								{
									Thread.sleep(200);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.print(".");
						}
					System.out.println();
					System.out.println();
						int randomNumber3 = (int)(Math.random() * 3) + 1;
						int randomNumber4 = (int)(Math.random() * 4) + 1;
//						System.out.println("this is the code : ");
//						System.out.println();
//						coding();
//						System.out.println();
						System.out.println("question " + (n+1) + " :");
						System.out.println("if the code runs:");
						System.out.println();
						switch(randomNumber4)
						{
							case 1:
									{
										System.out.println("Person x = new Person();");
										break;
									}
							case 2:
									{
										System.out.println("Person x = new Male();");
										break;
									}
							case 3:
									{
										System.out.println("Male x = new Person();");
										break;
									}
							case 4:
									{
										System.out.println("Male x = new Male();");
										break;
									}
						}
						switch(randomNumber3)
						{
							case 1:
									{
										System.out.println("x.sleeping();");
										break;
									}
							case 2:
									{
										System.out.println("x.eating();");
										break;
									}
							case 3:
									{
										System.out.println("x.beASon();");
										break;
									}
							
						}
						System.out.println();
						System.out.println("what will the result be?");
						System.out.println("A)  sleeping is necessary.");
						System.out.println("B)  eating 3 meals a day.");
						System.out.println("C)  7 hours sleeping is necessary.");
						System.out.println("D)  I'm a son of someone.");
						System.out.println("E)  The code will not executed.");
						Scanner q = new Scanner(System.in);
						String ua = q.nextLine();
						String userAnswer = ua.toUpperCase();
						if(randomNumber3 == 1 && randomNumber4 == 1 && userAnswer.equals("A"))
						{
							correct++;
						}
						if(randomNumber3 == 2 && randomNumber4 == 1 && userAnswer.equals("B"))
						{
							correct++;
						}
						if(randomNumber3 == 3 && randomNumber4 == 1 && userAnswer.equals("E"))
						{
							correct++;
						}
						if(randomNumber3 == 1 && randomNumber4 == 2 && userAnswer.equals("C"))
						{
							correct++;
						}
						if(randomNumber3 == 2 && randomNumber4 == 2 && userAnswer.equals("E"))
						{
							correct++;
						}
						if(randomNumber3 == 3 && randomNumber4 == 2 && userAnswer.equals("D"))
						{
							correct++;
						}
						if(randomNumber3 == 1 && randomNumber4 == 3 && userAnswer.equals("E"))
						{
							correct++;
						}
						if(randomNumber3 == 2 && randomNumber4 == 3 && userAnswer.equals("E"))
						{
							correct++;
						}
						if(randomNumber3 == 3 && randomNumber4 == 3 && userAnswer.equals("E"))
						{
							correct++;
						}
						if(randomNumber3 == 1 && randomNumber4 == 4 && userAnswer.equals("C"))
						{
							correct++;
						}
						if(randomNumber3 == 2 && randomNumber4 == 4 && userAnswer.equals("B"))
						{
							correct++;
						}
						if(randomNumber3 == 3 && randomNumber4 == 4 && userAnswer.equals("D"))
						{
							correct++;
						}
						
						
					}
				System.out.println("grade calculating...");
				int n = (int)((Math.random()*3)+5);
				for(int p = 0 ; p < n ; p++)
					{
						try
							{
								Thread.sleep(400);
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						System.out.print(".");
					}
				System.out.println();
				System.out.println("your grade is " + correct + " out of " + numberOfQuestion);
				
				
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
