package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TokenMgrError	TokenNameIdentifier
extends	TokenNameextends
Error	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
1L	TokenNameLongLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
LEXICAL_ERROR	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
STATIC_LEXER_ERROR	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
INVALID_LEXICAL_STATE	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
LOOP_DETECTED	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
errorCode	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
addEscapes	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
retval	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
char	TokenNamechar
ch	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
str	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
0	TokenNameIntegerLiteral
:	TokenNameCOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\b'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\b"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\t'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\t"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\n'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\n"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\f'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\f"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\r'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\r"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\"'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\''	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\'"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\\'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\\"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
ch	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
<	TokenNameLESS
0x20	TokenNameIntegerLiteral
||	TokenNameOR_OR
ch	TokenNameIdentifier
>	TokenNameGREATER
0x7e	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
"0000"	TokenNameStringLiteral
+	TokenNamePLUS
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\u"	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
retval	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
String	TokenNameIdentifier
LexicalError	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
EOFSeen	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
lexState	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
errorLine	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
errorColumn	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
errorAfter	TokenNameIdentifier
,	TokenNameCOMMA
char	TokenNamechar
curChar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
"Lexical error at line "	TokenNameStringLiteral
+	TokenNamePLUS
errorLine	TokenNameIdentifier
+	TokenNamePLUS
", column "	TokenNameStringLiteral
+	TokenNamePLUS
errorColumn	TokenNameIdentifier
+	TokenNamePLUS
".  Encountered: "	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
EOFSeen	TokenNameIdentifier
?	TokenNameQUESTION
"<EOF> "	TokenNameStringLiteral
:	TokenNameCOLON
(	TokenNameLPAREN
"""	TokenNameStringLiteral
+	TokenNamePLUS
addEscapes	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
curChar	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"""	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
" ("	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
curChar	TokenNameIdentifier
+	TokenNamePLUS
"), "	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
"after : ""	TokenNameStringLiteral
+	TokenNamePLUS
addEscapes	TokenNameIdentifier
(	TokenNameLPAREN
errorAfter	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
"""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TokenMgrError	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
TokenMgrError	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
reason	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
errorCode	TokenNameIdentifier
=	TokenNameEQUAL
reason	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TokenMgrError	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
EOFSeen	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
lexState	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
errorLine	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
errorColumn	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
errorAfter	TokenNameIdentifier
,	TokenNameCOMMA
char	TokenNamechar
curChar	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
reason	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
LexicalError	TokenNameIdentifier
(	TokenNameLPAREN
EOFSeen	TokenNameIdentifier
,	TokenNameCOMMA
lexState	TokenNameIdentifier
,	TokenNameCOMMA
errorLine	TokenNameIdentifier
,	TokenNameCOMMA
errorColumn	TokenNameIdentifier
,	TokenNameCOMMA
errorAfter	TokenNameIdentifier
,	TokenNameCOMMA
curChar	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
reason	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE