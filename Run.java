package ch2;

import java.lang.constant.Constable;
import java.util.ArrayList;
import static ch2.Constant.*;
import java.util.Random;
import java.util.Scanner;


public class Run {

	//메소드가 public static인 이유는 RestaurantDto에서 private로 선언되어있기에 외부에서 직접 참조하기 위해
	
    /**
     * 사이즈 중에서 랜덤 번호 추출
     * @param size
     * @return
     */
    public static int getRandomNumber(int x){ // int x나 int size나 맘대로 쓸 수 있는 매개변수
        return new Random().nextInt(x); 
    }

    /**
     * 랜덤 레스토랑 데이터 추출
     * @param data
     */
    public static void getRandomRestaurant(Data data){ //매개변수 값은 함수를 호출할 때 괄호 안의 자료형에 맞게 함수에 전달 //전달받은 매개변수 data를 사용하여 출력
        int i = getRandomNumber(data.makeList().size());//data.makeList()의 크기를 랜덤넘버로 추출
        data.makeList().get(i).print();//data.makeList()를 get(i)로 불러와 print()메서드 추출
    }
    
  
    /**
     * 카테고리별 레스토랑 데이터 추출
     * @param data
     * @param category
     * @return
     */
    public static void getRandomRestaurantByCategory(Data data, String category) {

        ArrayList<RestaurantDto> categorys = new ArrayList<>();// RestaurantDto 
        for (int i = 0; i < data.makeList().size(); i++) { //data.makeList()의 크기만큼 반복
            if (data.makeList().get(i).getCategoryName().equals(category)) { //만약 data.makeList()에서 get(i)로 불러온 CategoryName() 이 한식이면 한식 출력
                categorys.add(data.makeList().get(i));//data.makeList().get(0), (1) ..번쨰 하여 밑으로가서 (랜덤) ///추가할거야 data.makeList().get(i) i번째 해당하는 것  categorys에 data.makeList().get(i) 를 추가
            }
        }
        int num = getRandomNumber(categorys.size()); //이것 사이즈를 랜덤으로추출 중 하나 출력하여
        categorys.get(num).print(); //print()메서드로 추출
    }

    /*
    public static RestaurantDto getRandomRestaurantByCategory2(Data data, String category) {
    	
    	ArrayList<RestaurantDto> categorys = new ArrayList<>();// RestaurantDto 
    	for (int i = 0; i < data.makeList().size(); i++) { //data.makeList()의 크기만큼 반복
    		if (data.makeList().get(i).getCategoryName().equals(category)) { //만약 data.makeList()에서 get(i)로 불러온 CategoryName() 이 한식이면 한식 출력
    			categorys.add(data.makeList().get(i));//data.makeList().get(0), (1) ..번쨰 하여 밑으로가서 (랜덤) ///추가할거야 data.makeList().get(i) i번째 해당하는 것  categorys에 data.makeList().get(i) 를 추가
    		}
    	}
    	int num = getRandomNumber(categorys.size()); //이것 사이즈를 랜덤으로추출 중 하나 출력하여
    	RestaurantDto restaurantDto = categorys.get(num);//
    	return restaurantDto;
    }
    */

    /**
     * run
     * @param args
     */
    public static void main(String[] args) {

        Data data = new Data(); //Data 인스턴스화
        Scanner scan = new Scanner(System.in); 
        boolean run = true;
        int i;

        while (run) {
            System.out.println(SYSTEM_START); // "| 1.카테고리별 | 2.랜덤추천 | 3.프로그램 종료 |"
            System.out.print(SELECT); //"선택 >>"
            i = scan.nextInt(); //번호 입력

            if (i == 1) {
                System.out.println(Constant.MENE); //"| 1.한식 | 2.중식 | 3.일식 | 4.양식 | 5.초기메뉴 | 6.프로그램 종료 |"
                System.out.print(SELECT); //"선택 >>"
                i = scan.nextInt();
                if (i == 1) { 
                    getRandomRestaurantByCategory(data, KOREAN); // KOREAN = "한식" 에 대한 랜덤 print()값 나옴 -> 다시 while(run)처음 SYSTEM_START로 돌아감
                } else if (i == 2) {
                    getRandomRestaurantByCategory(data, CHINESE);
                } else if (i == 3) {
                    getRandomRestaurantByCategory(data, JAPANESE);
                } else if (i == 4) {
                    getRandomRestaurantByCategory(data, WESTERN);
                } else if (i == 5) {
                    System.out.println(SHUT_DOWN); // SHUT_DOWN = "프로그램을 종료 합니다. 하고 프로그램 끝남
                    run = false;
                } else {
                    System.out.println(ERROR); //ERROR = "잘못 입력하셨습니다." 하고 -> 다시 while(run)처음 SYSTEM_START로 돌아감
                }
                System.out.println(INFO_TXT);
            }else if(i==2) {
                getRandomRestaurant(data); //data.makeList()의 크기를 랜덤넘버로 추출하여 data.makeList()를 get(i)로 불러와 print()메서드 랜덤 값 추출
            }
            else if(i==3) {
                System.out.println(SHUT_DOWN); // SHUT_DOWN = "프로그램을 종료 합니다. 하고 프로그램 끝남
                run=false;
            }
            else {
                System.out.println(ERROR); //ERROR = "잘못 입력하셨습니다." 하고 -> 다시 while(run)처음 SYSTEM_START로 돌아감
            }
        }
    }
}
