/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AWithDecBody extends PBody
{
    private PDeclarations _declarations_;
    private TBegin _begin_;
    private PInstructions _instructions_;

    public AWithDecBody()
    {
        // Constructor
    }

    public AWithDecBody(
        @SuppressWarnings("hiding") PDeclarations _declarations_,
        @SuppressWarnings("hiding") TBegin _begin_,
        @SuppressWarnings("hiding") PInstructions _instructions_)
    {
        // Constructor
        setDeclarations(_declarations_);

        setBegin(_begin_);

        setInstructions(_instructions_);

    }

    @Override
    public Object clone()
    {
        return new AWithDecBody(
            cloneNode(this._declarations_),
            cloneNode(this._begin_),
            cloneNode(this._instructions_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWithDecBody(this);
    }

    public PDeclarations getDeclarations()
    {
        return this._declarations_;
    }

    public void setDeclarations(PDeclarations node)
    {
        if(this._declarations_ != null)
        {
            this._declarations_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declarations_ = node;
    }

    public TBegin getBegin()
    {
        return this._begin_;
    }

    public void setBegin(TBegin node)
    {
        if(this._begin_ != null)
        {
            this._begin_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._begin_ = node;
    }

    public PInstructions getInstructions()
    {
        return this._instructions_;
    }

    public void setInstructions(PInstructions node)
    {
        if(this._instructions_ != null)
        {
            this._instructions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instructions_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declarations_)
            + toString(this._begin_)
            + toString(this._instructions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declarations_ == child)
        {
            this._declarations_ = null;
            return;
        }

        if(this._begin_ == child)
        {
            this._begin_ = null;
            return;
        }

        if(this._instructions_ == child)
        {
            this._instructions_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declarations_ == oldChild)
        {
            setDeclarations((PDeclarations) newChild);
            return;
        }

        if(this._begin_ == oldChild)
        {
            setBegin((TBegin) newChild);
            return;
        }

        if(this._instructions_ == oldChild)
        {
            setInstructions((PInstructions) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
