
import org.junit.*;


public class test {

     ConvertNumberstoWord convernum = new ConvertNumberstoWord();
 
   
    @Test
    public void UnittoUnits() {
      
        Assert.assertEquals( "1" , "One" , convernum.convert(1));
        
    }

    @Test
    public void TentoTens() {
      
        Assert.assertEquals( "19" , "Nineteen" , convernum.convert(19));
        
    }

    @Test
    public void Hundredtohundred() {
      
        Assert.assertEquals( "878" , "Eight Hundred Seventy Eight" , convernum.convert(878));
        
    }

}

