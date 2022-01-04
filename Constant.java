package ch2;

public class Constant {

    public static final String SYSTEM_START = "| 1.카테고리별 | 2.랜덤추천 | 3.프로그램 종료 |";
    final static String MENE = "| 1.한식 | 2.중식 | 3.일식 | 4.양식 | 5.초기메뉴 | 6.프로그램 종료 |";
    final static String SELECT = "선택 >>";
    final static String KOREAN = "한식";
    final static String CHINESE = "중식";
    final static String JAPANESE = "일식";
    final static String WESTERN = "양식";
    final static String SHUT_DOWN = "프로그램을 종료 합니다.";
    final static String ERROR = "잘못 입력하셨습니다.";
    final static String INFO_TXT = "매장 명을 입력하시면 자세한 정보를 확인하실 수 있습니다.\n매장 명 > ";
}

/*
프로젝트를 하다 보면 여러 파일에서 똑같이 공유해야하는 상수값
여러 파일에서 공유해야 하는 상수 값은 한 파일에 모아 public static final로 선언하여 사용
*/