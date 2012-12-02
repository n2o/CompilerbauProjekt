/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANestedInstructions extends PInstructions
{
    private TBegin _begin_;
    private PInstructions _instructions_;
    private TEnd _end_;

    public ANestedInstructions()
    {
        // Constructor
    }

    public ANestedInstructions(
        @SuppressWarnings("hiding") TBegin _begin_,
        @SuppressWarnings("hiding") PInstructions _instructions_,
        @SuppressWarnings("hiding") TEnd _end_)
    {
        // Constructor
        setBegin(_begin_);

        setInstructions(_instructions_);

        setEnd(_end_);

    }

    @Override
    public Object clone()
    {
        return new ANestedInstructions(
            cloneNode(this._begin_),
            cloneNode(this._instructions_),
            cloneNode(this._end_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANestedInstructions(this);
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

    public TEnd getEnd()
    {
        return this._end_;
    }

    public void setEnd(TEnd node)
    {
        if(this._end_ != null)
        {
            this._end_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._end_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._begin_)
            + toString(this._instructions_)
            + toString(this._end_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
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

        if(this._end_ == child)
        {
            this._end_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
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

        if(this._end_ == oldChild)
        {
            setEnd((TEnd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
