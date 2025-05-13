package ch06.lecture.p05constructor;

public class app06 {
    myclass61 a = new myclass61();
    myclass61 b = new myclass61();
    myclass61 c = new myclass61();
    myclass62 d = new myclass62();
    myclass63 e = new myclass63();
    myclass64 f = new myclass64();

}

class myclass64 {
    //파라미터 있는 생성자와
    //파라미터 없는 생성자가 모두 필요하면
    // 다 작성해야함
    myclass64() {
    }

    myclass64(int a) {
    }
}

class myclass63 {
    //파라미터 있는 생성자 만들면
    //파라미터 없는 생성자는 자동으로 추가되지않음
}

class myclass61 {
    myclass61() {

    }
}

class myclass62 {
}
