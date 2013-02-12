package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SemanticVersionTest	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testParsing	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SemanticVersion	TokenNameIdentifier
version	TokenNameIdentifier
;	TokenNameSEMICOLON
version	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
version	TokenNameIdentifier
.	TokenNameDOT
major	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
&&	TokenNameAND_AND
version	TokenNameIdentifier
.	TokenNameDOT
minor	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
&&	TokenNameAND_AND
version	TokenNameIdentifier
.	TokenNameDOT
patch	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
version	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3-foo.2+Bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
version	TokenNameIdentifier
.	TokenNameDOT
major	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
&&	TokenNameAND_AND
version	TokenNameIdentifier
.	TokenNameDOT
minor	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
&&	TokenNameAND_AND
version	TokenNameIdentifier
.	TokenNameDOT
patch	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testComparison	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SemanticVersion	TokenNameIdentifier
v1	TokenNameIdentifier
,	TokenNameCOMMA
v2	TokenNameIdentifier
;	TokenNameSEMICOLON
v1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.4"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
v1	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
v1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
v1	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
v1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"2.0.0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
v1	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
v1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3-alpha"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
v1	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
v1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3+foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
v1	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
v1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3-alpha+foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
v1	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testIsSupportedBy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SemanticVersion	TokenNameIdentifier
v1	TokenNameIdentifier
,	TokenNameCOMMA
v2	TokenNameIdentifier
;	TokenNameSEMICOLON
v1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.4"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
v1	TokenNameIdentifier
.	TokenNameDOT
isSupportedBy	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
v2	TokenNameIdentifier
.	TokenNameDOT
isSupportedBy	TokenNameIdentifier
(	TokenNameLPAREN
v1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.3.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
v1	TokenNameIdentifier
.	TokenNameDOT
isSupportedBy	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
!	TokenNameNOT
v2	TokenNameIdentifier
.	TokenNameDOT
isSupportedBy	TokenNameIdentifier
(	TokenNameLPAREN
v1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"2.2.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.3.3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
!	TokenNameNOT
v1	TokenNameIdentifier
.	TokenNameDOT
isSupportedBy	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
!	TokenNameNOT
v2	TokenNameIdentifier
.	TokenNameDOT
isSupportedBy	TokenNameIdentifier
(	TokenNameLPAREN
v1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testInvalid	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertThrows	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertThrows	TokenNameIdentifier
(	TokenNameLPAREN
"1.0.0a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertThrows	TokenNameIdentifier
(	TokenNameLPAREN
"1.a.4"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertThrows	TokenNameIdentifier
(	TokenNameLPAREN
"1.0.0-foo&"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
assertThrows	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
new	TokenNamenew
SemanticVersion	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE