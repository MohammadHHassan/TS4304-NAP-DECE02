package day4;

public class Learning2DArrays
{
	public static void main(String[] args)
	{
		// Declaration of letter array in char. Size = 3x4
		char [][] letter = new char[3][4];
		
		// Row 0
		letter[0][0] = 'A';
		letter[0][1] = 'B';
		letter[0][2] = 'C';
		letter[0][3] = 'D';
		
		// Row 1
		letter[1][0] = 'E';
		letter[1][1] = 'F';
		letter[1][2] = 'G';
		letter[1][3] = 'H';
		
		// Row 2
		letter[2][0] = 'I';
		letter[2][1] = 'J';
		letter[2][2] = 'K';
		letter[2][3] = 'L';
		
		for(int row=0 ; row<letter.length ; row++)
		{
			for(int col=0 ; col<letter[row].length ; col++)
			{
				System.out.print(letter[row][col] + "\t");
			}
			System.out.println();
		}
	}
}
