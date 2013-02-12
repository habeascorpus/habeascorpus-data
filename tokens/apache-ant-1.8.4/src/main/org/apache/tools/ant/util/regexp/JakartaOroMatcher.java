package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
regexp	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
oro	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
regex	TokenNameIdentifier
.	TokenNameDOT
MatchResult	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
oro	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
regex	TokenNameIdentifier
.	TokenNameDOT
Pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
oro	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
regex	TokenNameIdentifier
.	TokenNameDOT
Perl5Compiler	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
oro	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
regex	TokenNameIdentifier
.	TokenNameDOT
Perl5Matcher	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
BuildException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JakartaOroMatcher	TokenNameIdentifier
implements	TokenNameimplements
RegexpMatcher	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
Perl5Compiler	TokenNameIdentifier
compiler	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Perl5Compiler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
Perl5Matcher	TokenNameIdentifier
matcher	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Perl5Matcher	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
JakartaOroMatcher	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPattern	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
pattern	TokenNameIdentifier
=	TokenNameEQUAL
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getPattern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Pattern	TokenNameIdentifier
getCompiledPattern	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
options	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Pattern	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
pattern	TokenNameIdentifier
,	TokenNameCOMMA
getCompilerOptions	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
p	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
matches	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
argument	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
matches	TokenNameIdentifier
(	TokenNameLPAREN
argument	TokenNameIdentifier
,	TokenNameCOMMA
MATCH_DEFAULT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
matches	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
options	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
Pattern	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
getCompiledPattern	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
matcher	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Vector	TokenNameIdentifier
getGroups	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
argument	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
getGroups	TokenNameIdentifier
(	TokenNameLPAREN
argument	TokenNameIdentifier
,	TokenNameCOMMA
MATCH_DEFAULT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Vector	TokenNameIdentifier
getGroups	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
options	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
matches	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
options	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Vector	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MatchResult	TokenNameIdentifier
mr	TokenNameIdentifier
=	TokenNameEQUAL
matcher	TokenNameIdentifier
.	TokenNameDOT
getMatch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
cnt	TokenNameIdentifier
=	TokenNameEQUAL
mr	TokenNameIdentifier
.	TokenNameDOT
groups	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
cnt	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
match	TokenNameIdentifier
=	TokenNameEQUAL
mr	TokenNameIdentifier
.	TokenNameDOT
group	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
match	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
match	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
v	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
match	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
getCompilerOptions	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
options	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
cOptions	TokenNameIdentifier
=	TokenNameEQUAL
Perl5Compiler	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
RegexpUtil	TokenNameIdentifier
.	TokenNameDOT
hasFlag	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
,	TokenNameCOMMA
MATCH_CASE_INSENSITIVE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cOptions	TokenNameIdentifier
|=	TokenNameOR_EQUAL
Perl5Compiler	TokenNameIdentifier
.	TokenNameDOT
CASE_INSENSITIVE_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
RegexpUtil	TokenNameIdentifier
.	TokenNameDOT
hasFlag	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
,	TokenNameCOMMA
MATCH_MULTILINE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cOptions	TokenNameIdentifier
|=	TokenNameOR_EQUAL
Perl5Compiler	TokenNameIdentifier
.	TokenNameDOT
MULTILINE_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
RegexpUtil	TokenNameIdentifier
.	TokenNameDOT
hasFlag	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
,	TokenNameCOMMA
MATCH_SINGLELINE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cOptions	TokenNameIdentifier
|=	TokenNameOR_EQUAL
Perl5Compiler	TokenNameIdentifier
.	TokenNameDOT
SINGLELINE_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
cOptions	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
