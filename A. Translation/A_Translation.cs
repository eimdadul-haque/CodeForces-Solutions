using System;

class A_Translation
{
    public static void Main(string[] args)
    {
        string real = Console.ReadLine();
        string tenslated = Console.ReadLine();
        solve(real, tenslated);
    }

    public static void solve(string real, string tenslated){
        int j = 0;
        char[] arrCh = real.ToCharArray();
        char[] arrCh2 = new char[arrCh.Length];
        for (int i = arrCh.Length-1; i>=0; i--){
            arrCh2[j] = arrCh[i];
            j++;
        }

        if(new String(arrCh2).Equals(tenslated)){
            Console.WriteLine("YES");
        }
        else{
            Console.WriteLine("NO");
        }
    }
}
