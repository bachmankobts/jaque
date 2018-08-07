package com.trigersoft.jaque.expression;

/**
 * Bridge to protected JaQUe project class ExpressionClassCracker
 * 
 * Motivation: cannot use JaQUe project without caching lambdas. To workaround its internal cache we
 * need an access to expression class cracker that parses lambdas.
 * 
 * @author kassovic.marian
 *
 */
public class ExpressionClassCrackerBridge {

  public static LambdaExpression<?> compileLambda(Object lambda) {
    ExpressionClassCracker cracker = new ExpressionClassCracker();
    return cracker.lambda(lambda);
  }

}
