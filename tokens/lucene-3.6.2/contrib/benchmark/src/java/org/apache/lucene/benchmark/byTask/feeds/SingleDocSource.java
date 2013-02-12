package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
feeds	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SingleDocSource	TokenNameIdentifier
extends	TokenNameextends
ContentSource	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
docID	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DOC_TEXT	TokenNameIdentifier
=	TokenNameEQUAL
"Well, this is just some plain text we use for creating the "	TokenNameStringLiteral
+	TokenNamePLUS
"test documents. It used to be a text from an online collection "	TokenNameStringLiteral
+	TokenNamePLUS
"devoted to first aid, but if there was there an (online) lawyers "	TokenNameStringLiteral
+	TokenNamePLUS
"first aid collection with legal advices, "it" might have quite "	TokenNameStringLiteral
+	TokenNamePLUS
"probably advised one not to include "it"'s text or the text of "	TokenNameStringLiteral
+	TokenNamePLUS
"any other online collection in one's code, unless one has money "	TokenNameStringLiteral
+	TokenNamePLUS
"that one don't need and one is happy to donate for lawyers "	TokenNameStringLiteral
+	TokenNamePLUS
"charity. Anyhow at some point, rechecking the usage of this text, "	TokenNameStringLiteral
+	TokenNamePLUS
"it became uncertain that this text is free to use, because "	TokenNameStringLiteral
+	TokenNamePLUS
"the web site in the disclaimer of he eBook containing that text "	TokenNameStringLiteral
+	TokenNamePLUS
"was not responding anymore, and at the same time, in projGut, "	TokenNameStringLiteral
+	TokenNamePLUS
"searching for first aid no longer found that eBook as well. "	TokenNameStringLiteral
+	TokenNamePLUS
"So here we are, with a perhaps much less interesting "	TokenNameStringLiteral
+	TokenNamePLUS
"text for the test, but oh much much safer. "	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
synchronized	TokenNamesynchronized
int	TokenNameint
newdocid	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
NoMoreDataException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
docID	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
!	TokenNameNOT
forever	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NoMoreDataException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
docID	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
DocData	TokenNameIdentifier
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
DocData	TokenNameIdentifier
docData	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NoMoreDataException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
id	TokenNameIdentifier
=	TokenNameEQUAL
newdocid	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addBytes	TokenNameIdentifier
(	TokenNameLPAREN
DOC_TEXT	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docData	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docData	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"doc"	TokenNameStringLiteral
+	TokenNamePLUS
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docData	TokenNameIdentifier
.	TokenNameDOT
setBody	TokenNameIdentifier
(	TokenNameLPAREN
DOC_TEXT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
docData	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
resetInputs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
resetInputs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docID	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE