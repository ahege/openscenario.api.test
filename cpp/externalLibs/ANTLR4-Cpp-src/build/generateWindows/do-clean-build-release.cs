//css_include all;

using System.Runtime.CompilerServices;

public static class Script
{
    [MethodImpl(MethodImplOptions.NoInlining)]
    public static void Main()
    {
        a.ScriptPath.Dir("output").Dir("Win32").Dir("Release").Delete();
        a.ScriptPath.Dir("output").Dir("x64").Dir("Release").Delete();
    }
}
