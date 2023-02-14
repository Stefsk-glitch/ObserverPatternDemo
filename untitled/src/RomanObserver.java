public class RomanObserver extends Observer
{
    public RomanObserver(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }

    private String intToRoman(int num)
    {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i = 0; i < values.length; i++)
        {
            while(num >= values[i])
            {
                num = num - values[i];
                roman.append(romanLetters[i]);
            }
        }
        return roman.toString();
    }

    @Override
    public void update()
    {
        System.out.println( "Roman String: " + intToRoman(subject.getState()));
    }
}
