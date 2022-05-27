package entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question1 {

	@Id
	@Column(name = "que_id")
	private int queId;
	
	private String question;
	
	@OneToMany(mappedBy = "que",fetch = FetchType.EAGER)
	private List<Answer1> answer1s;

	public int getQueId() {
		return queId;
	}

	public void setQueId(int queId) {
		this.queId = queId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer1> getAnswers() {
		return answer1s;
	}

	public void setAnswers(List<Answer1> answer1s) {
		this.answer1s = answer1s;
	}
	public Question1(int queId, String question, List<Answer1> answer1s) {
		super();
		this.queId = queId;
		this.question = question;
		this.answer1s = answer1s;
	}

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
