package ExceptionExamples;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}

class VoterIDMissingException extends Exception{


    VoterIDMissingException(String msg){
        super(msg);
    }
}

public class TestCustomException {
    public static void main(String[] args) {
        try{
            validateAge(21);

        }catch (InvalidAgeException ageException){
            System.out.println("Exception Occurred:" +ageException);
            // analyse
        }catch (VoterIDMissingException voterIdMissigExc){
            System.out.println("Exception Occurred:" +voterIdMissigExc);
        }
        System.out.println("Rest of the code..");
    }

    private static void validateAge(int age) throws InvalidAgeException,  VoterIDMissingException
    {
        System.out.println("Age passed here"+age);
        if(age<18) {
            throw new InvalidAgeException("You are not matchig the age criteria to cast vote");
        } else if (age > 18) {
            System.out.println("You are good to vote");
        }
        else {
            throw new VoterIDMissingException("I don't have voter card");
        }
    }
}
