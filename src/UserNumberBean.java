import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "userNumberBean")
@SessionScoped
public class UserNumberBean implements Serializable{
    private Integer randomInt;
    private Integer userNumber;
    private String response;


    public UserNumberBean() {
        randomInt= (int) (Math.random() *10 +1);
    }

    public String getResponse(){
        if(userNumber.equals(randomInt)){
            return "You  have guess the right number!\n";
        } else if (userNumber<randomInt) {
            return "You guess to low.\n";
        } else{
            return "You guess to high.\n";
        }
    }

    public String resetGame(){
        randomInt = (int) (Math.random() * 10 + 1);
        return "index";
    }

    public Integer getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(Integer randomInt) {
        this.randomInt = randomInt;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public void setResponse(String response) {
        this.response = response;
    }



}
