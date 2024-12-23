package kkk;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class kkkkkkk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="manishKumar";
		Map<Character,Long> occurance=s.chars().mapToObj(c->(char)c).filter(Character :: isLetterOrDigit).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		occurance.forEach((character,frequency)->System.out.println("charcter "+character+"  frequency"+frequency));
}
	}

