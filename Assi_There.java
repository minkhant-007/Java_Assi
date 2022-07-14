package Assigiment;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.swing.plaf.ScrollPaneUI;

public class Assi_There {
	
	
	public static void main(String[] args) {
		// out put
//		Scanner sc = new Scanner(System.in);
//		System.out.print("If you typing one , we can show Laptop Brand :");
//		String num = sc.nextLine();
//			
//			
//				if(num.equalsIgnoreCase("one")) {
//					System.out.println("Lenovo  HP Samsung  Acer Dell Asus " );
//					
//					System.out.println("------ customer choose----------");
//					System.out.print("Enter Brand:");
//					String brand = sc.nextLine();
//					 
//					String laptop;
//					switch (brand) {
//						case "lenovo","hp","samsung","acer","dell","asus":
//							laptop = "Thank you, wait for price:";
//							break;
//						default:
//							laptop = "Unknow Brand, Plase show at pass `one`";
//					}
//					System.out.print("Enter core:");
//					String core = sc.nextLine();
//					System.out.println(laptop);
//					sc.close();
//					String cpu[] = { " i3" , " i5" , " i7" , " i9"};
//					String names[] = {"lenovo" , "hp" , "samsung" , "acer" , "dell" , "asus "};
//					double [][] prices = {
//							{ 230.21,400.21,294.2,693.33,340.44,691.99},
//							{ 529.483, 920.483,676.66,1594.659,783.012,1591.577},
//							{552.504,960,504,706.08,1663.992,817.056,1660.776},
//							{ 690.63,12000.63,882.6,2079.99,1021.32,2075.97}
//					};
//					int index = -1;
//					int indexz = -1;
//					int row = names.length;
//					for(var a = 0;a<row;a++) {
//						if(brand.equalsIgnoreCase(names[a])) {
//							index = a;
//							break;
//						}
//						if(index == -1) {
//							System.out.println("Dose not exist");
//						}else {
//							System.out.println(index);
//						}
//					int col = cpu.length;
//					for( var b=0;b<col;b++) {
//						if(core.equalsIgnoreCase(cpu[b])) {
//							indexz = b;
//							break;
//						}
//					}
//					
//				}
//					if(indexz == -1) {
//						System.out.println("Dose not exist!");
//					}else {
//						System.out.println(indexz);
//					}
//			}else {
//						System.out.println("Thanks for your trying");
//				}
		Scanner sc = new Scanner(System.in);
		int index = -1;
		int indexc = -1;
		
		String [] brands = {"lenovo","hp","samsung","acer","dell","asus"};
		String [] Cpu = {"core i3","core i5","core i7","core i9"};
		double [][] costs = {
				{230.21, 400.21, 294.2, 693.33, 340.44, 691.99},
				{529.483, 920.483, 676.66, 1594.65, 783.012, 1591.577},
				{552.504, 960.504, 706.08, 1663.99, 817.056, 1660.776},
				{690.63, 1200.63, 882.6, 2079.99, 1021.32, 2075.97}
		};
		
		// output
		System.out.print("\t\t");
		for(String out: brands) {
			System.out.print(out + "\t\t");
		}
		System.out.print("\n");
		int row = costs.length;
		int col = costs[0].length;
		for(var r=0;r<row;r++) {
			System.out.print(Cpu[r] + "\t\t");
			for(var c=0;c<col;c++) {
				System.out.print(costs[r][c] + "\t\t");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.print("Search your brands : ");
		String Sbrands = sc.nextLine();
		for(var c=0;c<brands.length;c++) {
			if(Sbrands.equalsIgnoreCase(brands[c])) {
				index = c;
				break;
			}	
		}
		
		if(index == -1) {
			System.out.println("does not exist");
			return;
		} 
		System.out.print("Search your CPU : ");
		String SCpu = sc.nextLine();
			for(var r=0;r<row;r++) {
				if(SCpu.equalsIgnoreCase(Cpu[r])) {
					indexc = r;
					break;
				}
			}
		
		
		if(indexc == -1) {
			System.out.println("does not exist");
			return;
		}
		System.out.println(costs[indexc][index]);
		
			}
			
		}
	}	


