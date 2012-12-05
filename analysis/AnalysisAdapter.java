/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleDeclarations(ASingleDeclarations node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfThenStatementStatement(AIfThenStatementStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfThenElseStatementStatement(AIfThenElseStatementStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileStatement(AWhileStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignStatement(AAssignStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrintStatement(APrintStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANestedStatement(ANestedStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABreakStatement(ABreakStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStatement(AStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrint(APrint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignment(AAssignment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanType(ABooleanType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntegerType(AIntegerType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComparisionExpression(AComparisionExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpression(AExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusExpression2(APlusExpression2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusExpression2(AMinusExpression2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrExpression2(AOrExpression2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorExpression2(AXorExpression2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpression2(AExpression2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModExpression3(AModExpression3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultExpression3(AMultExpression3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivExpression3(ADivExpression3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndExpression3(AAndExpression3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpression3(AExpression3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotExpression4(ANotExpression4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumberExpression4(ANumberExpression4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentifierExpression4(AIdentifierExpression4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATrueExpression4(ATrueExpression4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFalseExpression4(AFalseExpression4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGtComparision(AGtComparision node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGeComparision(AGeComparision node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALtComparision(ALtComparision node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeComparision(ALeComparision node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANeComparision(ANeComparision node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqComparision(AEqComparision node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfThenStatement(AIfThenStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfThenElseStatement(AIfThenElseStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfThenElseStatementNoShortIf(AIfThenElseStatementNoShortIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfStatementNoShortIf(AIfStatementNoShortIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileStatementNoShortIf(AWhileStatementNoShortIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileWhileStatementNoShortIf(AWhileWhileStatementNoShortIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileWhileStatement(AWhileWhileStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteger(TInteger node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolean(TBoolean node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBegin(TBegin node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgramend(TProgramend node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnd(TEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgram(TProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWriteln(TWriteln node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBreak(TBreak node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLCurlyBracket(TLCurlyBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRCurlyBracket(TRCurlyBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLt(TLt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGt(TGt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLe(TLe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGe(TGe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNe(TNe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhitespace(TWhitespace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
