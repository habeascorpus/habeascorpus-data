package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
ShadowedSymbolTable	TokenNameIdentifier
extends	TokenNameextends
SymbolTable	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
SymbolTable	TokenNameIdentifier
fSymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ShadowedSymbolTable	TokenNameIdentifier
(	TokenNameLPAREN
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fSymbolTable	TokenNameIdentifier
=	TokenNameEQUAL
symbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
addSymbol	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
symbol	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fSymbolTable	TokenNameIdentifier
.	TokenNameDOT
containsSymbol	TokenNameIdentifier
(	TokenNameLPAREN
symbol	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fSymbolTable	TokenNameIdentifier
.	TokenNameDOT
addSymbol	TokenNameIdentifier
(	TokenNameLPAREN
symbol	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
addSymbol	TokenNameIdentifier
(	TokenNameLPAREN
symbol	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
addSymbol	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fSymbolTable	TokenNameIdentifier
.	TokenNameDOT
containsSymbol	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fSymbolTable	TokenNameIdentifier
.	TokenNameDOT
addSymbol	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
addSymbol	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
hash	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
symbol	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fSymbolTable	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
(	TokenNameLPAREN
symbol	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
hash	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fSymbolTable	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE