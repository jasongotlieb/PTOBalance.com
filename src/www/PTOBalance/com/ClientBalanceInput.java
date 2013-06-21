package www.PTOBalance.com;

/**
 * POST a JSON object:
 * {
	"pto" : int,
	"ptoScale" : enum(YEAR, MONTH),
	"payCycle" : enum(WEEKLY,DAILY,MONTHLY,BI_WEEKLY),
	"sickDays" : int,
	"sickScale" : enum(YEAR, MONTH)
 * }
 * @author gotoblob
 */
public class ClientBalanceInput {

	public static enum Scale{YEAR, MONTH};
	public static enum PayCycle{WEEKLY, DAILY, MONTHLY, BI_WEEKLY};
	
	private Integer pto;
	private Scale ptoScale;
	private PayCycle payCycle;
	
	private Integer sickDays;
	private Scale sickScale;
	
	public ClientBalanceInput() {}
	
	public ClientBalanceInput(Integer pto, Scale ptoScale, PayCycle payCycle,
			Integer sickDays, Scale sickScale) {
		super();
		this.pto = pto;
		this.ptoScale = ptoScale;
		this.payCycle = payCycle;
		this.sickDays = sickDays;
		this.sickScale = sickScale;
	}

	public Integer getPto() {
		return pto;
	}
	public void setPto(Integer pto) {
		this.pto = pto;
	}
	public Scale getPtoScale() {
		return ptoScale;
	}
	public void setPtoScale(Scale ptoScale) {
		this.ptoScale = ptoScale;
	}
	public PayCycle getPayCycle() {
		return payCycle;
	}
	public void setPayCycle(PayCycle payCycle) {
		this.payCycle = payCycle;
	}
	public Integer getSickDays() {
		return sickDays;
	}
	public void setSickDays(Integer sickDays) {
		this.sickDays = sickDays;
	}
	public Scale getSickScale() {
		return sickScale;
	}
	public void setSickScale(Scale sickScale) {
		this.sickScale = sickScale;
	}
	
}
