
package ch2;

import java.util.ArrayList;
import java.util.Random;

public class Randoms {
	
	public static int getRandomNumber(int x){ 
		return new Random().nextInt(x);
		 
    }

	
public static RestaurantDto getRandomRestaurantByCategory2(imadata data, String category) {
    	
    	ArrayList<RestaurantDto> categorys = new ArrayList<>();// RestaurantDto 
    	for (int i = 0; i < data.makeList().size(); i++) { //data.makeList()의 크기만큼 반복
    		if (data.makeList().get(i).getCategoryName().equals(category)) { //만약 data.makeList()에서 get(i)로 불러온 CategoryName() 이 한식이면 한식 출력
    			categorys.add(data.makeList().get(i));
    		
    		}
    	}
    	int num = getRandomNumber(categorys.size()); //이것 사이즈를 랜덤으로추출 중 하나 출력하여
    	RestaurantDto restaurantDto = categorys.get(num);//
    	return restaurantDto;
}



}



