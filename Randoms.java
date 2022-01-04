
package ch2;

import java.util.ArrayList;
import java.util.Random;

public class Randoms {
	
	public static int getRandomNumber(int x){ 
		return new Random().nextInt(x);
		 
    }

	
public static RestaurantDto getRandomRestaurantByCategory2(imadata data, String category) {
    	
    	ArrayList<RestaurantDto> categorys = new ArrayList<>();// RestaurantDto 
    	for (int i = 0; i < data.makeList().size(); i++) { //data.makeList()�� ũ�⸸ŭ �ݺ�
    		if (data.makeList().get(i).getCategoryName().equals(category)) { //���� data.makeList()���� get(i)�� �ҷ��� CategoryName() �� �ѽ��̸� �ѽ� ���
    			categorys.add(data.makeList().get(i));
    		
    		}
    	}
    	int num = getRandomNumber(categorys.size()); //�̰� ����� ������������ �� �ϳ� ����Ͽ�
    	RestaurantDto restaurantDto = categorys.get(num);//
    	return restaurantDto;
}



}



