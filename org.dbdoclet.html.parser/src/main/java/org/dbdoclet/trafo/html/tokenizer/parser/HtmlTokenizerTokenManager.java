/* Generated By:JJTree&JavaCC: Do not edit this line. HtmlTokenizerTokenManager.java */
package org.dbdoclet.trafo.html.tokenizer.parser;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import org.dbdoclet.progress.ProgressListener;
import org.dbdoclet.progress.ProgressEvent;
import org.dbdoclet.progress.ProgressManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/** Token Manager. */
public class HtmlTokenizerTokenManager implements HtmlTokenizerConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x900L) != 0L)
            return 21;
         if ((active0 & 0x1eL) != 0L)
            return 22;
         return -1;
      case 1:
         if ((active0 & 0x800L) != 0L)
            return 4;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         return jjStartNfaWithStates_0(0, 3, 22);
      case 10:
         return jjStartNfaWithStates_0(0, 4, 22);
      case 13:
         return jjStartNfaWithStates_0(0, 2, 22);
      case 32:
         return jjStartNfaWithStates_0(0, 1, 22);
      case 60:
         jjmatchedKind = 8;
         return jjMoveStringLiteralDfa1_0(0x800L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(3, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0xffc00000000L, 0x0L, 0x0L, 0x1ffffffff000000L
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0x80000000800000L
};
static final long[] jjbitVec5 = {
   0xffffffffffffffffL, 0x4000ffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec6 = {
   0xffffffffffffcfffL, 0xffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec7 = {
   0x0L, 0x0L, 0xffffffffffff0000L, 0xffffffffffffffffL
};
static final long[] jjbitVec8 = {
   0x0L, 0x0L, 0x0L, 0xffff000000000000L
};
static final long[] jjbitVec9 = {
   0x1L, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec10 = {
   0x0L, 0x0L, 0x0L, 0xffffffff0000L
};
static final long[] jjbitVec11 = {
   0x0L, 0x0L, 0x0L, 0xc000000000000000L
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 21;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xefffff7bffffffffL & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                     jjCheckNAddStates(0, 2);
                  }
                  else if ((0x8400000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  else if (curChar == 60)
                     jjCheckNAddStates(3, 6);
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 21:
                  if ((0xfbff7ffdffffffffL & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 4;
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 22:
                  if ((0xefffff7bffffffffL & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 60)
                     jjCheckNAddTwoStates(3, 8);
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 1:
                  if ((0xefffff7bffffffffL & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 2:
                  if (curChar == 60)
                     jjCheckNAddTwoStates(3, 8);
                  break;
               case 3:
                  if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0xffffdfffffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0xffffdfffffffffffL & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 6:
                  if (curChar != 62)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 7:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if ((0xfbff7ffdffffffffL & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 9:
                  if (curChar == 60)
                     jjCheckNAddStates(3, 6);
                  break;
               case 10:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
               case 5:
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 21:
                  if ((0xf800000178000001L & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 115)
                     jjAddStates(7, 8);
                  break;
               case 22:
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 8:
                  if ((0xf800000178000001L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 11:
                  if (curChar == 115)
                     jjAddStates(7, 8);
                  break;
               case 12:
                  if (curChar == 116 && kind > 5)
                     kind = 5;
                  break;
               case 13:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 101 && kind > 5)
                     kind = 5;
                  break;
               case 18:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 121)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
               case 5:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 21:
               case 8:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 22:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 21 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_2(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_2(int pos, long active0)
{
   return jjMoveNfa_2(jjStopStringLiteralDfa_2(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 47:
         return jjStopAtPos(0, 18);
      case 61:
         return jjStopAtPos(0, 17);
      case 62:
         return jjStopAtPos(0, 16);
      default :
         return jjMoveNfa_2(0, 0);
   }
}
static final long[] jjbitVec12 = {
   0xfffe7000fffffff6L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x5e00000000ffffffL
};
static final long[] jjbitVec13 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec14 = {
   0x0L, 0xbfff000000000000L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec15 = {
   0x3000L, 0xffff000000000000L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec16 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec17 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffL
};
static final long[] jjbitVec18 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffff00000000ffffL
};
static final long[] jjbitVec19 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffffffffL
};
static final long[] jjbitVec20 = {
   0x0L, 0x0L, 0x80000000000000L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec21 = {
   0xffffffffffffffffL, 0xbfffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec22 = {
   0x8000000000003000L, 0xffff000000000001L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 10;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7ff600000000000L & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                     jjCheckNAdd(9);
                  }
                  else if (curChar == 39)
                     jjCheckNAddTwoStates(6, 7);
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(3, 4);
                  if (curChar == 58)
                  {
                     if (kind > 19)
                        kind = 19;
                     jjCheckNAdd(1);
                  }
                  break;
               case 1:
                  if ((0x7ff600000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 3:
                  if ((0xbffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar == 34 && kind > 20)
                     kind = 20;
                  break;
               case 5:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(6, 7);
                  break;
               case 6:
                  if ((0xbfffff7fffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(6, 7);
                  break;
               case 7:
                  if (curChar == 39 && kind > 20)
                     kind = 20;
                  break;
               case 8:
                  if ((0x7ff600000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x87ffe04000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                     jjCheckNAdd(9);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 19)
                        kind = 19;
                     jjCheckNAdd(1);
                  }
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  jjAddStates(9, 10);
                  break;
               case 6:
                  jjAddStates(11, 12);
                  break;
               case 8:
               case 9:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 19)
                        kind = 19;
                     jjCheckNAdd(1);
                  }
                  if (jjCanMove_3(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 20)
                        kind = 20;
                     jjCheckNAdd(9);
                  }
                  break;
               case 1:
                  if (!jjCanMove_3(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(9, 10);
                  break;
               case 6:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(11, 12);
                  break;
               case 8:
               case 9:
                  if (!jjCanMove_3(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 10 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(14, 0);
}
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 15;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 4:
                  if ((0x100002600L & l) != 0L)
                     jjAddStates(13, 14);
                  break;
               case 5:
                  if (curChar == 62)
                     kind = 6;
                  break;
               case 14:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if (curChar == 115)
                     jjAddStates(15, 16);
                  break;
               case 3:
                  if (curChar == 116)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 6:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 7:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 101)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 11:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 121)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 15 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa1_3(0x400000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_3(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa2_3(active0, 0x400000L);
      default :
         return 2;
   }
}
private int jjMoveStringLiteralDfa2_3(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(2, 22);
         break;
      default :
         return 3;
   }
   return 3;
}
static final int[] jjnextStates = {
   1, 2, 7, 10, 3, 8, 11, 16, 20, 3, 4, 6, 7, 4, 5, 9, 
   13, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 47:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec9[i2] & l2) != 0L);
      case 253:
         return ((jjbitVec10[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec11[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_2(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec13[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec14[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec15[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec16[i2] & l2) != 0L);
      case 47:
         return ((jjbitVec17[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 253:
         return ((jjbitVec18[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec19[i2] & l2) != 0L);
      default :
         if ((jjbitVec12[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_3(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec20[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec21[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec22[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec16[i2] & l2) != 0L);
      case 47:
         return ((jjbitVec17[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 253:
         return ((jjbitVec18[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec19[i2] & l2) != 0L);
      default :
         if ((jjbitVec12[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\74", null, null, null, null, 
null, null, null, "\76", "\75", "\57", null, null, null, null, null, null, null, 
null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "WithinIgnorable",
   "TAG_CONTEXT",
   "COMMENT_CONTEXT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, 0, -1, 2, -1, -1, 3, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, 0, -1, -1, 
   -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x5f0701L, 
};
static final long[] jjtoSkip = {
   0xf07eL, 
};
static final long[] jjtoMore = {
   0x200880L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[21];
private final int[] jjstateSet = new int[42];
protected char curChar;
/** Constructor. */
public HtmlTokenizerTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public HtmlTokenizerTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 21; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 7)
         {
            jjmatchedKind = 7;
         }
         break;
       case 2:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 21)
         {
            jjmatchedKind = 21;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
