package ch2;

import java.lang.constant.Constable;
import java.util.ArrayList;
import static ch2.Constant.*;
import java.util.Random;
import java.util.Scanner;


public class Run {

	//�޼ҵ尡 public static�� ������ RestaurantDto���� private�� ����Ǿ��ֱ⿡ �ܺο��� ���� �����ϱ� ����
	
    /**
     * ������ �߿��� ���� ��ȣ ����
     * @param size
     * @return
     */
    public static int getRandomNumber(int x){ // int x�� int size�� ����� �� �� �ִ� �Ű�����
        return new Random().nextInt(x); 
    }

    /**
     * ���� ������� ������ ����
     * @param data
     */
    public static void getRandomRestaurant(Data data){ //�Ű����� ���� �Լ��� ȣ���� �� ��ȣ ���� �ڷ����� �°� �Լ��� ���� //���޹��� �Ű����� data�� ����Ͽ� ���
        int i = getRandomNumber(data.makeList().size());//data.makeList()�� ũ�⸦ �����ѹ��� ����
        data.makeList().get(i).print();//data.makeList()�� get(i)�� �ҷ��� print()�޼��� ����
    }
    
  
    /**
     * ī�װ��� ������� ������ ����
     * @param data
     * @param category
     * @return
     */
    public static void getRandomRestaurantByCategory(Data data, String category) {

        ArrayList<RestaurantDto> categorys = new ArrayList<>();// RestaurantDto 
        for (int i = 0; i < data.makeList().size(); i++) { //data.makeList()�� ũ�⸸ŭ �ݺ�
            if (data.makeList().get(i).getCategoryName().equals(category)) { //���� data.makeList()���� get(i)�� �ҷ��� CategoryName() �� �ѽ��̸� �ѽ� ���
                categorys.add(data.makeList().get(i));//data.makeList().get(0), (1) ..���� �Ͽ� �����ΰ��� (����) ///�߰��Ұž� data.makeList().get(i) i��° �ش��ϴ� ��  categorys�� data.makeList().get(i) �� �߰�
            }
        }
        int num = getRandomNumber(categorys.size()); //�̰� ����� ������������ �� �ϳ� ����Ͽ�
        categorys.get(num).print(); //print()�޼���� ����
    }

    /*
    public static RestaurantDto getRandomRestaurantByCategory2(Data data, String category) {
    	
    	ArrayList<RestaurantDto> categorys = new ArrayList<>();// RestaurantDto 
    	for (int i = 0; i < data.makeList().size(); i++) { //data.makeList()�� ũ�⸸ŭ �ݺ�
    		if (data.makeList().get(i).getCategoryName().equals(category)) { //���� data.makeList()���� get(i)�� �ҷ��� CategoryName() �� �ѽ��̸� �ѽ� ���
    			categorys.add(data.makeList().get(i));//data.makeList().get(0), (1) ..���� �Ͽ� �����ΰ��� (����) ///�߰��Ұž� data.makeList().get(i) i��° �ش��ϴ� ��  categorys�� data.makeList().get(i) �� �߰�
    		}
    	}
    	int num = getRandomNumber(categorys.size()); //�̰� ����� ������������ �� �ϳ� ����Ͽ�
    	RestaurantDto restaurantDto = categorys.get(num);//
    	return restaurantDto;
    }
    */

    /**
     * run
     * @param args
     */
    public static void main(String[] args) {

        Data data = new Data(); //Data �ν��Ͻ�ȭ
        Scanner scan = new Scanner(System.in); 
        boolean run = true;
        int i;

        while (run) {
            System.out.println(SYSTEM_START); // "| 1.ī�װ��� | 2.������õ | 3.���α׷� ���� |"
            System.out.print(SELECT); //"���� >>"
            i = scan.nextInt(); //��ȣ �Է�

            if (i == 1) {
                System.out.println(Constant.MENE); //"| 1.�ѽ� | 2.�߽� | 3.�Ͻ� | 4.��� | 5.�ʱ�޴� | 6.���α׷� ���� |"
                System.out.print(SELECT); //"���� >>"
                i = scan.nextInt();
                if (i == 1) { 
                    getRandomRestaurantByCategory(data, KOREAN); // KOREAN = "�ѽ�" �� ���� ���� print()�� ���� -> �ٽ� while(run)ó�� SYSTEM_START�� ���ư�
                } else if (i == 2) {
                    getRandomRestaurantByCategory(data, CHINESE);
                } else if (i == 3) {
                    getRandomRestaurantByCategory(data, JAPANESE);
                } else if (i == 4) {
                    getRandomRestaurantByCategory(data, WESTERN);
                } else if (i == 5) {
                    System.out.println(SHUT_DOWN); // SHUT_DOWN = "���α׷��� ���� �մϴ�. �ϰ� ���α׷� ����
                    run = false;
                } else {
                    System.out.println(ERROR); //ERROR = "�߸� �Է��ϼ̽��ϴ�." �ϰ� -> �ٽ� while(run)ó�� SYSTEM_START�� ���ư�
                }
                System.out.println(INFO_TXT);
            }else if(i==2) {
                getRandomRestaurant(data); //data.makeList()�� ũ�⸦ �����ѹ��� �����Ͽ� data.makeList()�� get(i)�� �ҷ��� print()�޼��� ���� �� ����
            }
            else if(i==3) {
                System.out.println(SHUT_DOWN); // SHUT_DOWN = "���α׷��� ���� �մϴ�. �ϰ� ���α׷� ����
                run=false;
            }
            else {
                System.out.println(ERROR); //ERROR = "�߸� �Է��ϼ̽��ϴ�." �ϰ� -> �ٽ� while(run)ó�� SYSTEM_START�� ���ư�
            }
        }
    }
}
