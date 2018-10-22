package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.RandomNumber;
import main.java.SortAlgos;

public class AlgoTest {
	
	private int size = 500;
	static SortAlgos sort_algo = new SortAlgos();

	@Test
	public void MethodForCoverage()
	{
		Item x[] = new Item[10];
		Item y[] = new Item[10];
		int input[]=new int[10];
		input = new int[] {1,6,2,8,3,0,4,9,10,7};
		for(int i =0;i<input.length;i++)
		{
			x[i]=new Item(input[i]);
			y[i] = new Item(input[i]);
		}
		
		SortAlgos.bubbleSort(x);
		SortAlgos.selectionSort(y);
		
		for(int j =0;j<input.length;j++)
		{
			assert(x[j].key== y[j].key);
		}
	}
	
	@Test (expected = NullPointerException.class)
	public void MethodForNullInputCoverage()
	{
		Item x[] = new Item[10];
		Item y[] = new Item[10];
		int input[]=new int[10];
		input = new int[] {};
		for(int i =0;i<input.length;i++)
		{
			x[i]=new Item(input[i]);
			y[i] = new Item(input[i]);
		}
		
		SortAlgos.bubbleSort(x);
		SortAlgos.selectionSort(y);
		
		for(int j =0;j<input.length;j++)
		{
			assert(x[j].key== y[j].key);
		}
	}
	
	@Test
	public void MethodForOnlyOneInputCoverage()
	{
		Item x[] = new Item[1];
		Item y[] = new Item[1];
		int input[]=new int[1];
		input = new int[] {24};
		for(int i =0;i<input.length;i++)
		{
			x[i]=new Item(input[i]);
			y[i] = new Item(input[i]);
		}
		
		SortAlgos.bubbleSort(x);
		SortAlgos.selectionSort(y);
		
		for(int j =0;j<input.length;j++)
		{
			assert(x[j].key== y[j].key);
		}
	}
	
	@Test
	public void MethodForMoreNumberOfInputsCoverage()
	{
		Item x[] = new Item[4];
		Item y[] = new Item[4];
		int input[]=new int[4];
		input = new int[] {10,17,21,30};
		for(int i =0;i<input.length;i++)
		{
			x[i]=new Item(input[i]);
			y[i] = new Item(input[i]);
		}
		
		SortAlgos.bubbleSort(x);
		SortAlgos.selectionSort(y);
		
		for(int j =0;j<input.length;j++)
		{
			assert(x[j].key== y[j].key);
		}
	}
	
	@Test
	public void MethodForBubbleAndMergeSortUsingRandom() 
	{
		Item[] a = getInput(size);
		Item[] b = a;
		SortAlgos.bubbleSort(a);
		SortAlgos.mergeSort(b);
		for(int j =0;j<10;j++)
		{
			assertTrue(a[j].key== b[j].key);
		}
	}
	
	
	@Test
	public void MethodOfBubbleAndSelectionSortUsingRandom() 
	{
		Item[] a2 = getInput(size);
		Item[] b2 = a2;
		SortAlgos.bubbleSort(a2);
		SortAlgos.selectionSort(b2);
		for(int j =0;j<10;j++)
		{
			assertTrue(a2[j].key== b2[j].key);
		}
	}
	
	
	@Test
	public void MethodOfBubbleAndInsertionSortUsingRandom() 
	{
		Item[] a2 = getInput(size);
		Item[] b2 = a2;
		SortAlgos.bubbleSort(a2);
		SortAlgos.insertionSort(b2);
		for(int j =0;j<10;j++)
		{
			assertTrue(a2[j].key== b2[j].key);
		}
	}
	
	@Test
	public void MethodOfBubbleAndQuickSortUsingRandom() 
	{
		Item[] a2 = getInput(size);
		Item[] b2 = a2;
		SortAlgos.bubbleSort(a2);
		SortAlgos.quickSort(b2);
		for(int j =0;j<10;j++)
		{
			assertTrue(a2[j].key== b2[j].key);
		}
	}
	
	@Test
	public void MethodOfBubbleAndHeapSortUsingRandom() 
	{
		Item[] a2 = getInput(size);
		Item[] b2 = a2;
		SortAlgos.bubbleSort(a2);
		SortAlgos.heapSort(b2);
		for(int j =0;j<10;j++)
		{
			assertTrue(a2[j].key== b2[j].key);
		}
	}
	
	@Test (expected = NullPointerException.class)
	public void IfNullPointerException()
	{
		SortAlgos.bubbleSort(getInput(0));
	}
	
	private Item[] getInput(int size) {
		Item[] items = null;
		if (size > 0) {
			items =  new Item[size];
			RandomNumber randomGenerator = new RandomNumber();
			for (int i = 0; i< size; i++) {
				items[i] = new Item(randomGenerator.nextIntRand(0, size));
			}
		}
		return items;
	}
}