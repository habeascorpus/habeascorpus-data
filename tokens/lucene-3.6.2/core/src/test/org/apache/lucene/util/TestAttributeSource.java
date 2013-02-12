package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
Token	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
tokenattributes	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestAttributeSource	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testCaptureState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
AttributeSource	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TypeAttribute	TokenNameIdentifier
typeAtt	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"TestTerm"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
typeAtt	TokenNameIdentifier
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
"TestType"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
hashCode	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AttributeSource	TokenNameIdentifier
.	TokenNameDOT
State	TokenNameIdentifier
state	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
captureState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
setEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"AnotherTestTerm"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
typeAtt	TokenNameIdentifier
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
"AnotherTestType"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Hash code should be different"	TokenNameStringLiteral
,	TokenNameCOMMA
hashCode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
src	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src	TokenNameIdentifier
.	TokenNameDOT
restoreState	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TestTerm"	TokenNameStringLiteral
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TestType"	TokenNameStringLiteral
,	TokenNameCOMMA
typeAtt	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Hash code should be equal after restore"	TokenNameStringLiteral
,	TokenNameCOMMA
hashCode	TokenNameIdentifier
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AttributeSource	TokenNameIdentifier
copy	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
copy	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
copy	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
copy	TokenNameIdentifier
.	TokenNameDOT
restoreState	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Both AttributeSources should have same hashCode after restore"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
copy	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Both AttributeSources should be equal after restore"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
,	TokenNameCOMMA
copy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AttributeSource	TokenNameIdentifier
src2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
typeAtt	TokenNameIdentifier
=	TokenNameEQUAL
src2	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FlagsAttribute	TokenNameIdentifier
flagsAtt	TokenNameIdentifier
=	TokenNameEQUAL
src2	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
FlagsAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
src2	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
flagsAtt	TokenNameIdentifier
.	TokenNameDOT
setFlags	TokenNameIdentifier
(	TokenNameLPAREN
12345	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src2	TokenNameIdentifier
.	TokenNameDOT
restoreState	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TestTerm"	TokenNameStringLiteral
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TestType"	TokenNameStringLiteral
,	TokenNameCOMMA
typeAtt	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"FlagsAttribute should not be touched"	TokenNameStringLiteral
,	TokenNameCOMMA
12345	TokenNameIntegerLiteral
,	TokenNameCOMMA
flagsAtt	TokenNameIdentifier
.	TokenNameDOT
getFlags	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AttributeSource	TokenNameIdentifier
src3	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
src3	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
src3	TokenNameIdentifier
.	TokenNameDOT
restoreState	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"The third instance is missing the TypeAttribute, so restoreState() should throw IllegalArgumentException"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
iae	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCloneAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
AttributeSource	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
FlagsAttribute	TokenNameIdentifier
flagsAtt	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
FlagsAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
TypeAttribute	TokenNameIdentifier
typeAtt	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
flagsAtt	TokenNameIdentifier
.	TokenNameDOT
setFlags	TokenNameIdentifier
(	TokenNameLPAREN
1234	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
typeAtt	TokenNameIdentifier
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
"TestType"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
AttributeSource	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
cloneAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Iterator	TokenNameIdentifier
<	TokenNameLESS
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
Attribute	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
it	TokenNameIdentifier
=	TokenNameEQUAL
clone	TokenNameIdentifier
.	TokenNameDOT
getAttributeClassesIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"FlagsAttribute must be the first attribute"	TokenNameStringLiteral
,	TokenNameCOMMA
FlagsAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TypeAttribute must be the second attribute"	TokenNameStringLiteral
,	TokenNameCOMMA
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
"No more attributes"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
FlagsAttribute	TokenNameIdentifier
flagsAtt2	TokenNameIdentifier
=	TokenNameEQUAL
clone	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
FlagsAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
TypeAttribute	TokenNameIdentifier
typeAtt2	TokenNameIdentifier
=	TokenNameEQUAL
clone	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotSame	TokenNameIdentifier
(	TokenNameLPAREN
"FlagsAttribute of original and clone must be different instances"	TokenNameStringLiteral
,	TokenNameCOMMA
flagsAtt2	TokenNameIdentifier
,	TokenNameCOMMA
flagsAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotSame	TokenNameIdentifier
(	TokenNameLPAREN
"TypeAttribute of original and clone must be different instances"	TokenNameStringLiteral
,	TokenNameCOMMA
typeAtt2	TokenNameIdentifier
,	TokenNameCOMMA
typeAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"FlagsAttribute of original and clone must be equal"	TokenNameStringLiteral
,	TokenNameCOMMA
flagsAtt2	TokenNameIdentifier
,	TokenNameCOMMA
flagsAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TypeAttribute of original and clone must be equal"	TokenNameStringLiteral
,	TokenNameCOMMA
typeAtt2	TokenNameIdentifier
,	TokenNameCOMMA
typeAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
flagsAtt2	TokenNameIdentifier
.	TokenNameDOT
setFlags	TokenNameIdentifier
(	TokenNameLPAREN
4711	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
typeAtt2	TokenNameIdentifier
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
"OtherType"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
copyTo	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"FlagsAttribute of original must now contain updated term"	TokenNameStringLiteral
,	TokenNameCOMMA
4711	TokenNameIntegerLiteral
,	TokenNameCOMMA
flagsAtt	TokenNameIdentifier
.	TokenNameDOT
getFlags	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TypeAttribute of original must now contain updated type"	TokenNameStringLiteral
,	TokenNameCOMMA
"OtherType"	TokenNameStringLiteral
,	TokenNameCOMMA
typeAtt	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotSame	TokenNameIdentifier
(	TokenNameLPAREN
"FlagsAttribute of original and clone must be different instances"	TokenNameStringLiteral
,	TokenNameCOMMA
flagsAtt2	TokenNameIdentifier
,	TokenNameCOMMA
flagsAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotSame	TokenNameIdentifier
(	TokenNameLPAREN
"TypeAttribute of original and clone must be different instances"	TokenNameStringLiteral
,	TokenNameCOMMA
typeAtt2	TokenNameIdentifier
,	TokenNameCOMMA
typeAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"FlagsAttribute of original and clone must be equal"	TokenNameStringLiteral
,	TokenNameCOMMA
flagsAtt2	TokenNameIdentifier
,	TokenNameCOMMA
flagsAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TypeAttribute of original and clone must be equal"	TokenNameStringLiteral
,	TokenNameCOMMA
typeAtt2	TokenNameIdentifier
,	TokenNameCOMMA
typeAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testToStringAndMultiAttributeImplementations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
AttributeSource	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TypeAttribute	TokenNameIdentifier
typeAtt	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"TestTerm"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
typeAtt	TokenNameIdentifier
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
"TestType"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Attributes should appear in original order"	TokenNameStringLiteral
,	TokenNameCOMMA
"("	TokenNameStringLiteral
+	TokenNamePLUS
termAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
","	TokenNameStringLiteral
+	TokenNamePLUS
typeAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
")"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
AttributeImpl	TokenNameIdentifier
>	TokenNameGREATER
it	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getAttributeImplsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Iterator should have 2 attributes left"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertSame	TokenNameIdentifier
(	TokenNameLPAREN
"First AttributeImpl from iterator should be termAtt"	TokenNameStringLiteral
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Iterator should have 1 attributes left"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertSame	TokenNameIdentifier
(	TokenNameLPAREN
"Second AttributeImpl from iterator should be typeAtt"	TokenNameStringLiteral
,	TokenNameCOMMA
typeAtt	TokenNameIdentifier
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
"Iterator should have 0 attributes left"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src	TokenNameIdentifier
.	TokenNameDOT
addAttributeImpl	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Token	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"CharTermAttribute should be implemented by Token"	TokenNameStringLiteral
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
instanceof	TokenNameinstanceof
Token	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getAttributeImplsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Token	TokenNameIdentifier
tok	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Token	TokenNameIdentifier
)	TokenNameRPAREN
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
"There should be only one attribute implementation instance"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
setEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"TestTerm"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Token should only printed once"	TokenNameStringLiteral
,	TokenNameCOMMA
"("	TokenNameStringLiteral
+	TokenNamePLUS
tok	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
")"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testDefaultAttributeFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
AttributeSource	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"CharTermAttribute is not implemented by CharTermAttributeImpl"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
CharTermAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"OffsetAttribute is not implemented by OffsetAttributeImpl"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
OffsetAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
OffsetAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"FlagsAttribute is not implemented by FlagsAttributeImpl"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
FlagsAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
FlagsAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"PayloadAttribute is not implemented by PayloadAttributeImpl"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PayloadAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
PayloadAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"PositionIncrementAttribute is not implemented by PositionIncrementAttributeImpl"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PositionIncrementAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
PositionIncrementAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"TypeAttribute is not implemented by TypeAttributeImpl"	TokenNameStringLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
TypeAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
{	TokenNameLBRACE
"rawtypes"	TokenNameStringLiteral
,	TokenNameCOMMA
"unchecked"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
public	TokenNamepublic
void	TokenNamevoid
testInvalidArguments	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
AttributeSource	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Should throw IllegalArgumentException"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
iae	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
AttributeSource	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
.	TokenNameDOT
TOKEN_ATTRIBUTE_FACTORY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Should throw IllegalArgumentException"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
iae	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
AttributeSource	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Class	TokenNameIdentifier
)	TokenNameRPAREN
Iterator	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Should throw IllegalArgumentException"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
iae	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testLUCENE_3042	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
AttributeSource	TokenNameIdentifier
src1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src1	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hash1	TokenNameIdentifier
=	TokenNameEQUAL
src1	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
AttributeSource	TokenNameIdentifier
src2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
src1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src2	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"The hashCode is identical, so the captured state was preserved."	TokenNameStringLiteral
,	TokenNameCOMMA
hash1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
src1	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
src2	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
src1	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
static	TokenNamestatic
class	TokenNameclass
TestAttributeImpl	TokenNameIdentifier
extends	TokenNameextends
AttributeImpl	TokenNameIdentifier
implements	TokenNameimplements
FlagsAttribute	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
flags	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getFlags	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
flags	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setFlags	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
flags	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
flags	TokenNameIdentifier
=	TokenNameEQUAL
flags	TokenNameIdentifier
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
flags	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
FlagsAttribute	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FlagsAttribute	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
setFlags	TokenNameIdentifier
(	TokenNameLPAREN
flags	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"foo=bar,moo=mae"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
static	TokenNamestatic
class	TokenNameclass
TestAttributeImpl2	TokenNameIdentifier
extends	TokenNameextends
TestAttributeImpl	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testReflectionOfToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
AttributeSource	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
AttributeImpl	TokenNameIdentifier
att	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TestAttributeImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src	TokenNameIdentifier
.	TokenNameDOT
addAttributeImpl	TokenNameIdentifier
(	TokenNameLPAREN
att	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertSame	TokenNameIdentifier
(	TokenNameLPAREN
"FlagsAttribute is not implemented by same instance of TestAttributeImpl"	TokenNameStringLiteral
,	TokenNameCOMMA
att	TokenNameIdentifier
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
FlagsAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
map	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
AttributeReflector	TokenNameIdentifier
reflector	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AttributeReflector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
reflect	TokenNameIdentifier
(	TokenNameLPAREN
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
Attribute	TokenNameIdentifier
>	TokenNameGREATER
attClass	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertSame	TokenNameIdentifier
(	TokenNameLPAREN
FlagsAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
attClass	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
map	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
att	TokenNameIdentifier
.	TokenNameDOT
reflectWith	TokenNameIdentifier
(	TokenNameLPAREN
reflector	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"mae"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"moo"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
map	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
src	TokenNameIdentifier
.	TokenNameDOT
reflectWith	TokenNameIdentifier
(	TokenNameLPAREN
reflector	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"mae"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"moo"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
map	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
new	TokenNamenew
TestAttributeImpl2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
reflectWith	TokenNameIdentifier
(	TokenNameLPAREN
reflector	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"TestAttributeImpl2 should fail assertion on toString() parsing"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
AssertionError	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE