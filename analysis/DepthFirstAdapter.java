/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPExpr().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAStartExpr(AStartExpr node)
    {
        defaultIn(node);
    }

    public void outAStartExpr(AStartExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStartExpr(AStartExpr node)
    {
        inAStartExpr(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        {
            List<PExpr> copy = new ArrayList<PExpr>(node.getDeclaration());
            for(PExpr e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PExpr> copy = new ArrayList<PExpr>(node.getStatement());
            for(PExpr e : copy)
            {
                e.apply(this);
            }
        }
        outAStartExpr(node);
    }

    public void inAStatementExpr(AStatementExpr node)
    {
        defaultIn(node);
    }

    public void outAStatementExpr(AStatementExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatementExpr(AStatementExpr node)
    {
        inAStatementExpr(node);
        {
            List<PExpr> copy = new ArrayList<PExpr>(node.getExpr());
            for(PExpr e : copy)
            {
                e.apply(this);
            }
        }
        outAStatementExpr(node);
    }

    public void inADeclarationExpr(ADeclarationExpr node)
    {
        defaultIn(node);
    }

    public void outADeclarationExpr(ADeclarationExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclarationExpr(ADeclarationExpr node)
    {
        inADeclarationExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADeclarationExpr(node);
    }

    public void inAPrintExpr(APrintExpr node)
    {
        defaultIn(node);
    }

    public void outAPrintExpr(APrintExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintExpr(APrintExpr node)
    {
        inAPrintExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAPrintExpr(node);
    }

    public void inAAssignmentExpr(AAssignmentExpr node)
    {
        defaultIn(node);
    }

    public void outAAssignmentExpr(AAssignmentExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignmentExpr(AAssignmentExpr node)
    {
        inAAssignmentExpr(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAAssignmentExpr(node);
    }

    public void inAComparisonExpr(AComparisonExpr node)
    {
        defaultIn(node);
    }

    public void outAComparisonExpr(AComparisonExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComparisonExpr(AComparisonExpr node)
    {
        inAComparisonExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getComparison() != null)
        {
            node.getComparison().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAComparisonExpr(node);
    }

    public void inAPlusExpr(APlusExpr node)
    {
        defaultIn(node);
    }

    public void outAPlusExpr(APlusExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExpr(APlusExpr node)
    {
        inAPlusExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAPlusExpr(node);
    }

    public void inAMinusExpr(AMinusExpr node)
    {
        defaultIn(node);
    }

    public void outAMinusExpr(AMinusExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpr(AMinusExpr node)
    {
        inAMinusExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMinusExpr(node);
    }

    public void inAOrExpr(AOrExpr node)
    {
        defaultIn(node);
    }

    public void outAOrExpr(AOrExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrExpr(AOrExpr node)
    {
        inAOrExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAOrExpr(node);
    }

    public void inAXorExpr(AXorExpr node)
    {
        defaultIn(node);
    }

    public void outAXorExpr(AXorExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpr(AXorExpr node)
    {
        inAXorExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAXorExpr(node);
    }

    public void inAModExpr(AModExpr node)
    {
        defaultIn(node);
    }

    public void outAModExpr(AModExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModExpr(AModExpr node)
    {
        inAModExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAModExpr(node);
    }

    public void inAMultExpr(AMultExpr node)
    {
        defaultIn(node);
    }

    public void outAMultExpr(AMultExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExpr(AMultExpr node)
    {
        inAMultExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMultExpr(node);
    }

    public void inADivExpr(ADivExpr node)
    {
        defaultIn(node);
    }

    public void outADivExpr(ADivExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExpr(ADivExpr node)
    {
        inADivExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivExpr(node);
    }

    public void inAAndExpr(AAndExpr node)
    {
        defaultIn(node);
    }

    public void outAAndExpr(AAndExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExpr(AAndExpr node)
    {
        inAAndExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAAndExpr(node);
    }

    public void inANotExpr(ANotExpr node)
    {
        defaultIn(node);
    }

    public void outANotExpr(ANotExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotExpr(ANotExpr node)
    {
        inANotExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outANotExpr(node);
    }

    public void inAWhileExpr(AWhileExpr node)
    {
        defaultIn(node);
    }

    public void outAWhileExpr(AWhileExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileExpr(AWhileExpr node)
    {
        inAWhileExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAWhileExpr(node);
    }

    public void inAIfThenExpr(AIfThenExpr node)
    {
        defaultIn(node);
    }

    public void outAIfThenExpr(AIfThenExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfThenExpr(AIfThenExpr node)
    {
        inAIfThenExpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAIfThenExpr(node);
    }

    public void inAIfThenElseExpr(AIfThenElseExpr node)
    {
        defaultIn(node);
    }

    public void outAIfThenElseExpr(AIfThenElseExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfThenElseExpr(AIfThenElseExpr node)
    {
        inAIfThenElseExpr(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        outAIfThenElseExpr(node);
    }

    public void inAIntegerExpr(AIntegerExpr node)
    {
        defaultIn(node);
    }

    public void outAIntegerExpr(AIntegerExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerExpr(AIntegerExpr node)
    {
        inAIntegerExpr(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntegerExpr(node);
    }

    public void inASemicolonExpr(ASemicolonExpr node)
    {
        defaultIn(node);
    }

    public void outASemicolonExpr(ASemicolonExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASemicolonExpr(ASemicolonExpr node)
    {
        inASemicolonExpr(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outASemicolonExpr(node);
    }

    public void inAIdentifierExpr(AIdentifierExpr node)
    {
        defaultIn(node);
    }

    public void outAIdentifierExpr(AIdentifierExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierExpr(AIdentifierExpr node)
    {
        inAIdentifierExpr(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdentifierExpr(node);
    }

    public void inANumberExpr(ANumberExpr node)
    {
        defaultIn(node);
    }

    public void outANumberExpr(ANumberExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberExpr(ANumberExpr node)
    {
        inANumberExpr(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberExpr(node);
    }

    public void inABooleanExpr(ABooleanExpr node)
    {
        defaultIn(node);
    }

    public void outABooleanExpr(ABooleanExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanExpr(ABooleanExpr node)
    {
        inABooleanExpr(node);
        if(node.getBoolean() != null)
        {
            node.getBoolean().apply(this);
        }
        outABooleanExpr(node);
    }

    public void inATrueExpr(ATrueExpr node)
    {
        defaultIn(node);
    }

    public void outATrueExpr(ATrueExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATrueExpr(ATrueExpr node)
    {
        inATrueExpr(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outATrueExpr(node);
    }

    public void inAFalseExpr(AFalseExpr node)
    {
        defaultIn(node);
    }

    public void outAFalseExpr(AFalseExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFalseExpr(AFalseExpr node)
    {
        inAFalseExpr(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAFalseExpr(node);
    }

    public void inAGtExpr(AGtExpr node)
    {
        defaultIn(node);
    }

    public void outAGtExpr(AGtExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGtExpr(AGtExpr node)
    {
        inAGtExpr(node);
        if(node.getGt() != null)
        {
            node.getGt().apply(this);
        }
        outAGtExpr(node);
    }

    public void inAGeExpr(AGeExpr node)
    {
        defaultIn(node);
    }

    public void outAGeExpr(AGeExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGeExpr(AGeExpr node)
    {
        inAGeExpr(node);
        if(node.getGe() != null)
        {
            node.getGe().apply(this);
        }
        outAGeExpr(node);
    }

    public void inALtExpr(ALtExpr node)
    {
        defaultIn(node);
    }

    public void outALtExpr(ALtExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALtExpr(ALtExpr node)
    {
        inALtExpr(node);
        if(node.getLt() != null)
        {
            node.getLt().apply(this);
        }
        outALtExpr(node);
    }

    public void inALeExpr(ALeExpr node)
    {
        defaultIn(node);
    }

    public void outALeExpr(ALeExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeExpr(ALeExpr node)
    {
        inALeExpr(node);
        if(node.getLe() != null)
        {
            node.getLe().apply(this);
        }
        outALeExpr(node);
    }

    public void inANeExpr(ANeExpr node)
    {
        defaultIn(node);
    }

    public void outANeExpr(ANeExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANeExpr(ANeExpr node)
    {
        inANeExpr(node);
        if(node.getNe() != null)
        {
            node.getNe().apply(this);
        }
        outANeExpr(node);
    }

    public void inAEqExpr(AEqExpr node)
    {
        defaultIn(node);
    }

    public void outAEqExpr(AEqExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqExpr(AEqExpr node)
    {
        inAEqExpr(node);
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        outAEqExpr(node);
    }

    public void inABreakExpr(ABreakExpr node)
    {
        defaultIn(node);
    }

    public void outABreakExpr(ABreakExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABreakExpr(ABreakExpr node)
    {
        inABreakExpr(node);
        if(node.getBreak() != null)
        {
            node.getBreak().apply(this);
        }
        outABreakExpr(node);
    }
}
