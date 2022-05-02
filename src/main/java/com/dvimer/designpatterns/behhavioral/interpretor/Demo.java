package com.dvimer.designpatterns.behhavioral.interpretor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    private static List<Token> lex;

    public static void main(String[] args) {

        String input = "(13+4)-(12+1)";
        List<Token> lex = lex(input);

        Element result = parse(lex);
        System.out.println("input:" + input + "=" + result);
    }

    static Element parse(List<Token> tokens) {
        BinaryOperation result = new BinaryOperation();
        boolean havLHS = false;
        for (int i = 0; i < tokens.size(); ++i) {
            Token token = tokens.get(i);
            switch (token.type) {
                case INTEGER:
                    MyInteger myInteger = new MyInteger(Integer.parseInt(token.text));
                    if (!havLHS) {
                        result.left = myInteger;
                        havLHS = true;
                    } else {
                        result.right = myInteger;
                    }
                    break;
                case PLUS:
                    result.type = BinaryOperation.Type.ADDITION;
                    break;
                case MINUS:
                    result.type = BinaryOperation.Type.SUBTRACTION;
                    break;
                case LPAREN:
                    int j = 0;
                    for (; j < tokens.size(); ++j) {
                        if (tokens.get(j).type == Token.Type.LPAREN) {
                            break;
                        }
                    }
                    List<Token> subexpressions = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .collect(Collectors.toList());
                    Element element = parse(subexpressions);
                    if (!havLHS) {
                        result.left = element;
                        havLHS = true;
                    } else {
                        result.right = element;

                    }
                    i = j;
                    break;
            }
        }
        return result;
    }

    private static List<Token> lex(String input) {
        List<Token> tokens = new ArrayList<>();

        for (int i = 0; i < input.length(); ++i) {
            switch (input.charAt(i)) {
                case '+':
                    tokens.add(new Token(Token.Type.PLUS, "+"));
                    break;
                case '-':
                    tokens.add(new Token(Token.Type.PLUS, "-"));
                    break;
                case '(':
                    tokens.add(new Token(Token.Type.LPAREN, "("));
                    break;
                case ')':
                    tokens.add(new Token(Token.Type.RPAREN, ")"));
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    for (int j = i + 1; j <= input.length(); ++j) {
                        if (Character.isDigit(input.charAt(i))) {
                            sb.append(input.charAt(i));
                            ++i;
                        } else {
                            tokens.add(new Token(Token.Type.INTEGER, sb.toString()));
                            --i;
                            break;
                        }
                    }
                    break;


            }
        }
        return tokens;
    }
}
