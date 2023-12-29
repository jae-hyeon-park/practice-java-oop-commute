package dev.syntax.app;

public class PublicTransport {
	private String type;
	private int num; //버스는 버스번호, 지하철은 호선을 의미
	private int passenger = 0; //승객수
	private int totalCost = 0; //총 매출액
	private int payCost;
	
	public PublicTransport(String type, int num, int payCost) {
		this.type = type;
		this.num = num;
		this.payCost = payCost;
		
	}
	
	
	@Override
	public String toString() {
		return "PublicTransport [type=" + type + ", num=" + num + ", passenger=" + passenger + ", totalCost="
				+ totalCost + "]";
	}
	
	public void ride(Student student) {
			
		if(student.getBudget()>=payCost) {
				passenger++;
				student.pay(payCost); //비용에 대한 필드를 메서드로 차감하게 하기
				totalCost += payCost;
		}else {
				System.out.println("잔액이 부족해 탑승할 수 없습니다.");
		}
		
	}
	
	public void getOff(Student student) {
		passenger--;
	}

	
	
}
