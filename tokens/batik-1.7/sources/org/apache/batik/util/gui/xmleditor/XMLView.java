package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
gui	TokenNameIdentifier
.	TokenNameDOT
xmleditor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Graphics	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
BadLocationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
PlainView	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
Segment	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
Utilities	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XMLView	TokenNameIdentifier
extends	TokenNameextends
PlainView	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
XMLContext	TokenNameIdentifier
context	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
XMLScanner	TokenNameIdentifier
lexer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLScanner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
tabSize	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
XMLView	TokenNameIdentifier
(	TokenNameLPAREN
XMLContext	TokenNameIdentifier
context	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
elem	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
elem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
context	TokenNameIdentifier
=	TokenNameEQUAL
context	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getTabSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
tabSize	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
drawUnselectedText	TokenNameIdentifier
(	TokenNameLPAREN
Graphics	TokenNameIdentifier
g	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
x	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
y	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
p0	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
p1	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BadLocationException	TokenNameIdentifier
{	TokenNameLBRACE
XMLDocument	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XMLDocument	TokenNameIdentifier
)	TokenNameRPAREN
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XMLToken	TokenNameIdentifier
token	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
getScannerStart	TokenNameIdentifier
(	TokenNameLPAREN
p0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
str	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
getText	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
.	TokenNameDOT
getStartOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
p1	TokenNameIdentifier
-	TokenNameMINUS
token	TokenNameIdentifier
.	TokenNameDOT
getStartOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lexer	TokenNameIdentifier
.	TokenNameDOT
setString	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lexer	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
token	TokenNameIdentifier
.	TokenNameDOT
getStartOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
ctx	TokenNameIdentifier
=	TokenNameEQUAL
token	TokenNameIdentifier
.	TokenNameDOT
getContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
lastCtx	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
pos	TokenNameIdentifier
<	TokenNameLESS
p0	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pos	TokenNameIdentifier
=	TokenNameEQUAL
lexer	TokenNameIdentifier
.	TokenNameDOT
scan	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
token	TokenNameIdentifier
.	TokenNameDOT
getStartOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastCtx	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
=	TokenNameEQUAL
lexer	TokenNameIdentifier
.	TokenNameDOT
getScanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
mark	TokenNameIdentifier
=	TokenNameEQUAL
p0	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
pos	TokenNameIdentifier
<	TokenNameLESS
p1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
lastCtx	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
g	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
.	TokenNameDOT
getSyntaxForeground	TokenNameIdentifier
(	TokenNameLPAREN
lastCtx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
setFont	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
.	TokenNameDOT
getSyntaxFont	TokenNameIdentifier
(	TokenNameLPAREN
lastCtx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Segment	TokenNameIdentifier
text	TokenNameIdentifier
=	TokenNameEQUAL
getLineBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
.	TokenNameDOT
getText	TokenNameIdentifier
(	TokenNameLPAREN
mark	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
-	TokenNameMINUS
mark	TokenNameIdentifier
,	TokenNameCOMMA
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
x	TokenNameIdentifier
=	TokenNameEQUAL
Utilities	TokenNameIdentifier
.	TokenNameDOT
drawTabbedText	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
,	TokenNameCOMMA
g	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
,	TokenNameCOMMA
mark	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mark	TokenNameIdentifier
=	TokenNameEQUAL
pos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
pos	TokenNameIdentifier
=	TokenNameEQUAL
lexer	TokenNameIdentifier
.	TokenNameDOT
scan	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
token	TokenNameIdentifier
.	TokenNameDOT
getStartOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastCtx	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
=	TokenNameEQUAL
lexer	TokenNameIdentifier
.	TokenNameDOT
getScanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
g	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
.	TokenNameDOT
getSyntaxForeground	TokenNameIdentifier
(	TokenNameLPAREN
lastCtx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
setFont	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
.	TokenNameDOT
getSyntaxFont	TokenNameIdentifier
(	TokenNameLPAREN
lastCtx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Segment	TokenNameIdentifier
text	TokenNameIdentifier
=	TokenNameEQUAL
getLineBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
.	TokenNameDOT
getText	TokenNameIdentifier
(	TokenNameLPAREN
mark	TokenNameIdentifier
,	TokenNameCOMMA
p1	TokenNameIdentifier
-	TokenNameMINUS
mark	TokenNameIdentifier
,	TokenNameCOMMA
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
x	TokenNameIdentifier
=	TokenNameEQUAL
Utilities	TokenNameIdentifier
.	TokenNameDOT
drawTabbedText	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
,	TokenNameCOMMA
g	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
,	TokenNameCOMMA
mark	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
