package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
tokenattributes	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
AttributeImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
OffsetAttributeImpl	TokenNameIdentifier
extends	TokenNameextends
AttributeImpl	TokenNameIdentifier
implements	TokenNameimplements
OffsetAttribute	TokenNameIdentifier
,	TokenNameCOMMA
Cloneable	TokenNameIdentifier
,	TokenNameCOMMA
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
startOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
endOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
startOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
startOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
startOffset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
endOffset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
startOffset	TokenNameIdentifier
=	TokenNameEQUAL
startOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
endOffset	TokenNameIdentifier
=	TokenNameEQUAL
endOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
endOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
endOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
startOffset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
endOffset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
other	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
this	TokenNamethis
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
other	TokenNameIdentifier
instanceof	TokenNameinstanceof
OffsetAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
OffsetAttributeImpl	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
OffsetAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
other	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
o	TokenNameIdentifier
.	TokenNameDOT
startOffset	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
startOffset	TokenNameIdentifier
&&	TokenNameAND_AND
o	TokenNameIdentifier
.	TokenNameDOT
endOffset	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
endOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
code	TokenNameIdentifier
=	TokenNameEQUAL
startOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
code	TokenNameIdentifier
=	TokenNameEQUAL
code	TokenNameIdentifier
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
+	TokenNamePLUS
endOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
code	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
copyTo	TokenNameIdentifier
(	TokenNameLPAREN
AttributeImpl	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
OffsetAttribute	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
OffsetAttribute	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
startOffset	TokenNameIdentifier
,	TokenNameCOMMA
endOffset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE