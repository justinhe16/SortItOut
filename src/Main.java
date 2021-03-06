import java.util.ArrayList;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		int len = 64;
		Random random = new Random();
		PrintWriter CSVFile = new PrintWriter("data.csv");
		//Length, Selection Time, Insertion Time.

		//1st CSV: Array Random Values
		long ARVLength;
		long ARVSelection;
		long ARVInsertion;
		//2nd CSV: Array Sorted Values
		long ASVLength;
		long ASVSelection;
		long ASVInsertion;
		//3rd CSV: Array Reverse Values
		long AReVLength;
		long AReVSelection;
		long AReVInsertion;
		//4th CSV: ArrayList Random Values
		long ArLRVLength;
		long ArLRVSelection;
		long ArLRVInsertion;
		//5th CSV: ArrayList Sorted Values
		long ArLSVLength;
		long ArLSVSelection;
		long ArLSVInsertion;
		//6th CSV: ArrayList Reverse Values
		long ArLReVLength;
		long ArLReVSelection;
		long ArLReVInsertion;


		CSVFile.println("Array Random Values");
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			ARVLength = len;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = random.nextInt();
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Selection(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Selection Sort for an Array with Random Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Selection Sort for an Array with Random Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			ARVSelection = TotalTime/10;
			TotalTime = 0;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = random.nextInt();
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Insertion(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Insertion Sort for an Array with Random Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Insertion Sort for an Array with Random Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds\
			ARVInsertion=TotalTime/10;
			CSVFile.println(ARVLength + "," + ARVSelection + "," + ARVInsertion);
			len=len*2;
		}

		// -----------------------------------
		CSVFile.println("Array Sorted Values");
		len = 64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			ASVLength = len;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = j;
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Selection(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Selection Sort for an Array with Sorted Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Selection Sort for an Array with Sorted Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			ASVSelection = TotalTime/10;
			TotalTime = 0;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = random.nextInt();
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Insertion(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Insertion Sort for an Array with Sorted Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Insertion Sort for an Array with Sorted Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			ASVInsertion=TotalTime/10;
			CSVFile.println(ASVLength + "," + ASVSelection + "," + ASVInsertion);
			len=len*2;
		}

		// ---------------------------------
		CSVFile.println("Array Reversed Values");
		len = 64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			AReVLength = len;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = (ArrayStep.length - j);
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Selection(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Selection Sort for an Array with Reversed Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Selection Sort for an Array with Reversed Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			AReVSelection = TotalTime/10;
			TotalTime = 0;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = (ArrayStep.length - j);
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Insertion(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Insertion Sort for an Array with Reversed Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Insertion Sort for an Array with Reversed Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			AReVInsertion = TotalTime/10;
			CSVFile.println(AReVLength + "," + AReVSelection + "," + AReVInsertion);
			len=len*2;
		}

		// ---------------------------
		CSVFile.println("ArrayList Random Values");
		len=64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			ArLRVLength = len;
			for (int r = 0; r < 10; r++){
				ArrayList<Integer> ArrayStep = new ArrayList<Integer>();
				for (int j = 0; j < len; j++){
					ArrayStep.add(random.nextInt());
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Selection(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Selection Sort for an ArrayList with Random Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Selection Sort for an ArrayList with Random Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			ArLRVSelection = TotalTime/10;
			TotalTime = 0;
			for (int r = 0; r < 10; r++){
				ArrayList<Integer> ArrayStep = new ArrayList<Integer>();
				for (int j = 0; j < len; j++){
					ArrayStep.add(random.nextInt());
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Insertion(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Insertion Sort for an ArrayList with Random Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Insertion Sort for an ArrayList with Random Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds\
			ArLRVInsertion=TotalTime/10;
			CSVFile.println(ArLRVLength + "," + ArLRVSelection + "," + ArLRVInsertion);
			len=len*2;
		}

		// -------------------
		CSVFile.println("ArrayList Sorted Values");
		len = 64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			ArLSVLength = len;
			for (int r = 0; r < 10; r++){
				ArrayList<Integer> ArrayStep = new ArrayList<Integer>();
				for (int j = 0; j < len; j++){
					ArrayStep.add(j);
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Selection(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Selection Sort for an ArrayList with Sorted Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Selection Sort for an ArrayList with Sorted Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			ArLSVSelection = TotalTime/10;
			TotalTime = 0;
			for (int r = 0; r < 10; r++){
				ArrayList<Integer> ArrayStep = new ArrayList<Integer>();
				for (int j = 0; j < len; j++){
					ArrayStep.add(j);
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Insertion(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Insertion Sort for an ArrayList with Sorted Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Insertion Sort for an ArrayList with Sorted Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			ArLSVInsertion=TotalTime/10;
			CSVFile.println(ArLSVLength + "," + ArLSVSelection + "," + ArLSVInsertion);
			len=len*2;
		}

		// ---------------------------------
		CSVFile.println("ArrayList Reversed Values");
		len = 64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			ArLReVLength = len;
			for (int r = 0; r < 10; r++){
				ArrayList<Integer> ArrayStep = new ArrayList<Integer>();
				for (int j = 0; j < len; j++){
					ArrayStep.add(len - j);
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Selection(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Selection Sort for an ArrayList with Reversed Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Selection Sort for an ArrayList with Reversed Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			ArLReVSelection = TotalTime/10;
			TotalTime = 0;
			for (int r = 0; r < 10; r++){
				ArrayList<Integer> ArrayStep = new ArrayList<Integer>();
				for (int j = 0; j < len; j++){
					ArrayStep.add(len -j);
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Insertion(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Insertion Sort for an ArrayList with Reversed Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Insertion Sort for an ArrayList with Reversed Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			ArLReVInsertion = TotalTime/10;
			CSVFile.println(ArLReVLength + "," + ArLReVSelection + "," + ArLReVInsertion);
			len=len*2;
		}




		/*
		// -------------------------------- Selection Sort for Array with Random Values
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = random.nextInt();
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Selection(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Selection Sort for an Array with Random Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Selection Sort for an Array with Random Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			len = len*2;
		}
		// -------------------------------- Selection Sort for Array with Random Values

		// -------------------------------- Insertion Sort for Array with Random Values
		len = 64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = random.nextInt();
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Insertion(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Insertion Sort for an Array with Random Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Insertion Sort for an Array with Random Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			len = len*2;
		}
		// -------------------------------- Insertion Sort for Array with Random Values
		 */
		/*
		// -------------------------------- Selection Sort for Array with Sorted Values
		len = 64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = j;
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Selection(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Selection Sort for an Array with Sorted Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Selection Sort for an Array with Sorted Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			len = len*2;
		}
		// -------------------------------- Selection Sort for Array with Sorted Values

		// -------------------------------- Insertion Sort for Array with Sorted Values
		len = 64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = j;
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Insertion(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Insertion Sort for an Array with Sorted Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Insertion Sort for an Array with Sorted Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			len = len*2;
		}
		// -------------------------------- Insertion Sort for Array with Sorted Values 
		 */
		/*
		// -------------------------------- Selection Sort for Array with Reversed Values
		len = 64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = (ArrayStep.length - j);
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Selection(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Selection Sort for an Array with Reversed Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Selection Sort for an Array with Reversed Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			len = len*2;
		}
		// -------------------------------- Selection Sort for Array with Reversed Values

		// -------------------------------- Insertion Sort for Array with Reversed Values
		len = 64;
		for (int x = 0; x < 12; x++){
			long TotalTime = 0;
			for (int r = 0; r < 10; r++){
				int[] ArrayStep = new int[len];
				for (int j = 0; j < ArrayStep.length; j++){
					ArrayStep[j] = (ArrayStep.length - j);
				}
				long starttime1 = System.currentTimeMillis();
				ArrayStep = Insertion(ArrayStep);
				long endtime1 = System.currentTimeMillis();

				System.out.println("Trial #" + (r+1) + " Insertion Sort for an Array with Reversed Values with " + len + " spots takes " + (endtime1 - starttime1) + " milliseconds"); // outputs time elapsed in milliseconds
				TotalTime += (endtime1 - starttime1);
			}
			System.out.println("Average Time for Insertion Sort for an Array with Reversed Values with " + len + " spots takes " + (TotalTime/10) + " milliseconds"); //out puts average time in milliseconds
			len = len*2;
		}
		// -------------------------------- Insertion Sort for Array with Reversed Values
		 */




		CSVFile.flush();
		CSVFile.close();
	}
	/*
		int[] testArray = new int[]{10, 21, 16, 7, 2, 5, 28, 3, 1};
		ArrayList<Integer> testArrayList = new ArrayList<Integer>() {{
		    add(10);
		    add(21);
		    add(16);
		    add(7);
		    add(2);
		    add(5);
		    add(28);
		    add(3);
		    add(1);
		}};

		int[] SelectiontestArray = Selection(testArray);
		for (int j = 0; j < SelectiontestArray.length; j++){
			System.out.println(SelectiontestArray[j]);
		}
		System.out.println("----------^ testArray through selection  ^------- ");

		int[] InsertiontestArray = Insertion(testArray);
		for (int r = 0; r < InsertiontestArray.length; r++){
			System.out.println(InsertiontestArray[r]);
		}
		System.out.println("----------^ testArray through insertion  ^------- ");

		ArrayList<Integer> SelectiontestArrayList = Selection(testArrayList);
		for (int r = 0; r < SelectiontestArrayList.size(); r++){
			System.out.println(SelectiontestArrayList.get(r));
		}
		System.out.println("----------^ testArrayList through selection  ^------- ");

		ArrayList<Integer> InsertiontestArrayList = Insertion(testArrayList);
		for (int r = 0; r < InsertiontestArrayList.size(); r++){
			System.out.println(InsertiontestArrayList.get(r));
		}
		System.out.println("----------^ testArrayList through insertion  ^------- ");

	 */


	public static int[] Selection(int a[]){
		int i, j;
		int iMin;
		//Selection sort
		for (j = 0; j < a.length - 1; j++){
			iMin = j;
			for (i=j+1; i < a.length; i++){
				if (a[i] < a[iMin]) {
					iMin = i;
				}
			}
			if (iMin != j){
				int atj = a[j];
				a[j] = a[iMin];
				a[iMin] = atj;
			}
		}
		return a;
	}

	public static ArrayList<Integer> Selection(ArrayList<Integer> a){
		int i, j;
		int iMin;
		//Selection sort
		for (j = 0; j < a.size() - 1; j++){
			iMin = j;
			for (i=j+1; i < a.size(); i++){
				if (a.get(i) < a.get(iMin)) {
					iMin = i;
				}
			}
			if (iMin != j){
				int atj = a.get(j);
				a.set(j, a.get(iMin));
				a.set(iMin, atj);
			}
		}
		return a;
	}

	public static int[] Insertion(int a[]){
		int x;
		int j;
		for (int i = 0; i < a.length; i++){
			x = a[i];
			j = i;
			while (j > 0 && a[j-1] > x){
				a[j] = a[j-1];
				j = j - 1;
			}
			a[j] = x; 
		}

		return a;
	}

	public static ArrayList<Integer> Insertion(ArrayList<Integer> a){
		int x;
		int j;
		for (int i = 0; i < a.size(); i++){
			x = a.get(i);
			j = i;
			while (j > 0 && a.get(j-1) > x){
				a.set(j, a.get(j-1));
				j = j - 1;
			}
			a.set(j, x);
		}

		return a;
	}
}




