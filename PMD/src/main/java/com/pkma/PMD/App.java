package com.pkma.PMD;

/**
 * Hello world!
 *
 */
public class App // PMD Goes extra mile than check style in this scenarion it show not to use short names like App although technically correct
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" ); /// Here sysout is an issue, we dont usually sysout
        System.out.println( "Hello World!" ); /// Here sysout is an issue, we dont usually sysout
    }
}

/*mvn pmd:pmd  Sample RULE SET
<?xml version="1.0" encoding="UTF-8"?>
<ruleset xmlns="http://pmd.sourceforge.net/ruleset/2.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         name="sample"
         xsi:schemaLocation="http://pmd.sourceforge.net/ruleset/2.0.0 http://pmd.sourceforge.net/ruleset_2_0_0.xsd">
   <description>PMD Plugin preferences rule set</description>
   <rule ref="rulesets/java/braces.xml/WhileLoopsMustUseBraces"/>
</ruleset>*/