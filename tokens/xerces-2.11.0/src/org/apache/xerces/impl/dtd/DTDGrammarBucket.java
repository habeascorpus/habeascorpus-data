package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dtd	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
XMLGrammarDescription	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DTDGrammarBucket	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
final	TokenNamefinal
Hashtable	TokenNameIdentifier
fGrammars	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
DTDGrammar	TokenNameIdentifier
fActiveGrammar	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
fIsStandalone	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DTDGrammarBucket	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammars	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
DTDGrammar	TokenNameIdentifier
grammar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XMLDTDDescription	TokenNameIdentifier
desc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XMLDTDDescription	TokenNameIdentifier
)	TokenNameRPAREN
grammar	TokenNameIdentifier
.	TokenNameDOT
getGrammarDescription	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fGrammars	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
,	TokenNameCOMMA
grammar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DTDGrammar	TokenNameIdentifier
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
DTDGrammar	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
fGrammars	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
XMLDTDDescription	TokenNameIdentifier
)	TokenNameRPAREN
desc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammars	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fActiveGrammar	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
fIsStandalone	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setStandalone	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
standalone	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fIsStandalone	TokenNameIdentifier
=	TokenNameEQUAL
standalone	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
boolean	TokenNameboolean
getStandalone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fIsStandalone	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setActiveGrammar	TokenNameIdentifier
(	TokenNameLPAREN
DTDGrammar	TokenNameIdentifier
grammar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fActiveGrammar	TokenNameIdentifier
=	TokenNameEQUAL
grammar	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DTDGrammar	TokenNameIdentifier
getActiveGrammar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fActiveGrammar	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE