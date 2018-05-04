package singleton;

import java.io.Serializable;

/* 
1. 코드가 단순해지며, 가독성이 좋습니다.

2. 인스턴스 생성과 상속을 방지하여 상수값의 타입안정성이 보장됩니다.

3. enum class를 사용해 새로운 상수들의 타입을 정의함으로 정의한 타입이외의 타입을 가진 데이터값을 컴파일시 체크한다.

4. 키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 알 수 있습니다.
 */
public enum Singleton implements Serializable {
	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
