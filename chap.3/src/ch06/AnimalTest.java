package ch06;

import java.util.ArrayList;

class Animal
{
	public void move()
	{
		System.out.println("Animal is move");
	}
	
	public void eating()
	{
		System.out.println("Animal is eat.");
	}
	
}

class Human extends Animal
{
	@Override
	public void move()
	{
		System.out.println("Human is walk");
		
	}
	public void readBooks()
	{
		System.out.println("Human is read book");
	}
	@Override
	public void eating()
	{
		System.out.println("����� �Դ´�");
	}
	
}

class Tiger extends Animal
{
	@Override
	public void move()
	{
		System.out.println("Tiger running ");
	}
	public void hunting()
	{
		System.out.println("Tiger is huntting");
	}
	
	@Override
	public void eating()
	{
		System.out.println("ȣ���̰� �Դ´�");
		
	}
	
}

class Eagle extends Animal
{
	@Override
	public void move()
	{
		System.out.println("������� �ϴ��� ���ư���");
		
	}
	public void flying()
	{
		System.out.println("�������� ������ ��� ���ư��ϴ�");
	}
	
	@Override
	public void eating()
	{
		System.out.println("�������� �Դ´�");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(eAnimal);
//		test.moveAnimal(tAnimal);
//		
//		test.eatAnimal(hAnimal);
//		test.eatAnimal(eAnimal);
//		test.eatAnimal(tAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList)
		{
			animal.eating();
			animal.move();
		}
	
		
	}
	
	public void moveAnimal(Animal animal)
	{
		animal.move();
		
	}
	
	public void eatAnimal(Animal animal)

	{
		animal.eating();
	}
}
